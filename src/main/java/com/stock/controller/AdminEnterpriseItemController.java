package com.stock.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.stock.mapper.NewsTypeMapper;
import com.stock.mapper.StatisticsMapper;
import com.stock.pojo.EnterpriseItem;
import com.stock.pojo.EntrepreneurialVideo;
import com.stock.pojo.FileRelation;
import com.stock.pojo.Files;
import com.stock.pojo.NewsType;
import com.stock.pojo.User;
import com.stock.service.EnterpriseItemService;
import com.stock.service.FileRelationService;
import com.stock.service.FileService;
import com.stock.service.NewsService;
import com.stock.service.UserService;

@Controller
public class AdminEnterpriseItemController {

	@Autowired
	EnterpriseItemService enterpriseItemService;
	@Autowired
	FileService fileService;
	@Autowired
	FileRelationService fileRelationService;
	@Autowired
	UserService userService;
	@Autowired
	StatisticsMapper statisticsMapper;
	@Autowired
	NewsTypeMapper newsTypeMapper;
	@Autowired
	NewsService newsService;
	
	
	
	
	/**
	 * 今日新闻行业统计
	 */
	@RequestMapping(value = "/newsIndustry_Source")
	public String newsIndustry_Source(Model model){
		
		List<EnterpriseItem> itemList = enterpriseItemService.selectAll();
		model.addAttribute("itemList", itemList);
		
		return "adPage/newsIndustry_Source";
	}
	
	/**
	 * 今日新闻行业统计
	 */
	@RequestMapping(value = "/todayNewsIndustry")
	public String todayNewsIndustry(Model model){
		
		List<EnterpriseItem> itemList = enterpriseItemService.selectAll();
		model.addAttribute("itemList", itemList);
		
		return "adPage/todayNewsIndustry";
	}
	
	/**
	 * 今日新闻来源统计
	 */
	@RequestMapping(value = "/todayNewsSource")
	public String todayNewsSource(Model model){
		
		List<EnterpriseItem> itemList = enterpriseItemService.selectAll();
		model.addAttribute("itemList", itemList);
		
		return "adPage/todayNewsSource";
	}
	/**
	 * 查看新闻总量
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/adminNewsNum")
	public String adminNewsNum(Model model){
		int newsNum = 0;
		int today_news = 0;
		int weekly_news = 0;
		int monthly_news = 0;
		//统计新闻数量
		newsNum = statisticsMapper.selectStatisticsNum("news_num");
		today_news = statisticsMapper.selectStatisticsNum("today_news");
		weekly_news = statisticsMapper.selectStatisticsNum("weekly_news");
		monthly_news = statisticsMapper.selectStatisticsNum("monthly_news");
		
		List<NewsType> newsTypesList = newsTypeMapper.selectNewsTypesByFlag("news");
		model.addAttribute("newsNum", newsNum);
		model.addAttribute("today_news", today_news);
		model.addAttribute("weekly_news", weekly_news);
		model.addAttribute("monthly_news", monthly_news);
		model.addAttribute("newsTypesList", newsTypesList);
		
		return "adPage/adminNewsNum";
	}
	
	/**
	 * 修改创业流程页面
	 * @param req
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/adminEditItem")
	public String adminEditItem(HttpServletRequest req, Model model){
		
		String enterUuid = req.getParameter("enterUuid");
		EnterpriseItem enterpriseItem = enterpriseItemService.selectByPrimaryKey(enterUuid);
		
		model.addAttribute("enterpriseItem", enterpriseItem);
		
		return "adPage/admin_edit_process";
	}
	
	/**
	 * 保存修改的创业流程
	 * @param enterpriseItem
	 * @return
	 */
	@RequestMapping(value = "/adminSaveItem")
	public ModelAndView adminSaveItem(EnterpriseItem enterpriseItem){
		
		System.out.println(enterpriseItem);
		enterpriseItemService.updateByPrimaryKey(enterpriseItem);
		
		ModelAndView view = new ModelAndView("redirect:/adminEnterpriseItem");
		
		return view;
	}
	
	/**
	 * 今日新闻相关公司
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/todayNewsCompany")
	public String aUploadVideoPage(Model model){
		
		//创业流程
		List<EnterpriseItem> itemList = enterpriseItemService.selectAll();
		TreeMap<Integer, String> itemMap = new TreeMap<Integer, String>();
		for(int i = 0; i < itemList.size(); i++){
			itemMap.put(Integer.valueOf(itemList.get(i).getEnterUuid()), itemList.get(i).getEnterOrder()+"."+itemList.get(i).getEnterName());
		}

		/*for (Entry<Integer, String> entry : itemMap.entrySet()) {
			System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
		}*/
		
		//创业流程关联的视频表
		List<FileRelation> reVideo = fileRelationService.selectEntrepreneurialVideo();
		List<EntrepreneurialVideo> videoList = new ArrayList<EntrepreneurialVideo>();
		for(int i = 0; i < reVideo.size(); i++){
			Files files = fileService.selectByPrimaryKey(reVideo.get(i).getFileUuid());
			EntrepreneurialVideo video = new EntrepreneurialVideo();
			video.setFileUuid(files.getFileUuid());
			video.setFileName(files.getFileName());
			video.setFileSize(files.getFileSize());
			video.setFileTime(files.getFileTime());
			video.setFileUrl(files.getFileUrl());
			video.setFileType(files.getFileType());
			video.setUserUuid(files.getUserUuid());
			String userName = userService.selectByPrimaryKey(video.getUserUuid()).getUserName();
			video.setUserName(userName);
			video.setEnterpriseItemId(reVideo.get(i).getObjectUuid());
			String item = itemMap.get(Integer.valueOf(video.getEnterpriseItemId()));
			video.setItem(item);
			String frUuid = reVideo.get(i).getFrUuid();
			video.setFrUuid(frUuid);
			videoList.add(video);
		}
		
		model.addAttribute("itemMap", itemMap);
		model.addAttribute("videoList", videoList);
		
		return "adPage/todayNewsCompany";
	}
	
	/**
	 * 上传创业视频
	 * @param file
	 * @param req
	 * @param res
	 * @throws IOException
	 */
	@RequestMapping(value = "/adminUploadVideo")
	public void adminUploadVideo(@RequestParam(value = "file", required = false)MultipartFile file, HttpServletRequest req, HttpServletResponse res) throws IOException{
	
		String name2 = file.getOriginalFilename();//String getOriginalFilename() 获取上传文件的原名
		String fileName = req.getParameter("fileName");
		String fileSize = req.getParameter("fileSize");
		String fileType = req.getParameter("fileType");
		String objectId = req.getParameter("objectId");
		
		PrintWriter out = res.getWriter();
		//获取用户
		User user = (User) req.getSession().getAttribute("user");
		String userUuid = "";
		String userName = "";
		if(user != null){
			userUuid = user.getUserUuid();
			userName = user.getUserName();
		}else{
			out.print("failure");
			return ;
		}
 
		String basePath = "E:/workspace/ventureassess/src/main/webapp/static/" ;
		String relativePath = "user_files/";
		String personalPath = userName + "/" ;
		File uploadDir = new File(basePath, relativePath + personalPath).getCanonicalFile();
		System.out.println("uploadDir="+uploadDir);
		
		if (!uploadDir.exists() || uploadDir.isFile()) {//isFile()判断给定文件名是否为正常的文件,如果文件存在且为正常的文件则返回TRUE
			uploadDir.mkdirs();//建文件夹
		}
		if (!file.isEmpty()) {
			InputStream is = file.getInputStream();
			FileOutputStream fos = new FileOutputStream(new File(uploadDir,name2));
			byte[] b = new byte[1024];
			int len = 0;
			while ((len = is.read(b)) > 0) {
				fos.write(b, 0, len);
			}
			fos.flush();
			fos.close();
			is.close();
			
			File temp = new File(uploadDir,name2);
			String url = temp.getPath();
			System.out.println("url:"+url);
			String url1 = relativePath + personalPath + name2;//存储路径名
			System.out.println("url1:"+url1);
			
			//插入文件表
			Files files = new Files();
			files.setFileName(fileName);
			files.setFileSize(fileSize);
			files.setFileType(fileType);
			files.setFileUrl(url1);
			files.setUserUuid(userUuid);
			fileService.insert(files);
			System.out.println(files);
			//插入文件关联表
			if(files != null){
				FileRelation fileRelation = new FileRelation();
				fileRelation.setObjectUuid(objectId);
				fileRelation.setFileUuid(files.getFileUuid());
				fileRelation.setType("创业视频");
				fileRelationService.insert(fileRelation);
				System.out.println(fileRelation);
				
				out.print("success");
			}
	
		}else{
			out.print("failure");
		}
	}
	
	/**
	 * 删除文件关联
	 * @param req
	 * @param res
	 * @throws IOException
	 */
	@RequestMapping(value = "/adminDelVidRelation")
	public void adminDelVidRelation(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		String frUuid = req.getParameter("frUuid");
		fileRelationService.deleteByPrimaryKey(frUuid);
		
		PrintWriter out = res.getWriter();
		
		out.print("success");
	}
	
	/**
	 * 删除创业事项
	 * @param req
	 * @param res
	 * @throws IOException
	 */
	@RequestMapping(value = "/adminDeleItem")
	public void adminDeleItem(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		String enterUuid = req.getParameter("enterUuid");
		enterpriseItemService.deleteByPrimaryKey(enterUuid);
		
		PrintWriter out = res.getWriter();
		
		out.print("success");
	}
	
	/**
	 * 验证名称重复
	 * @throws IOException 
	 */
	@RequestMapping(value = "/adminExistItemName")
	public void adminExistItemName(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		String enterName = new String(req.getParameter("enterName").getBytes("ISO8859-1"),"UTF-8");//解决从前台获取的数据乱码问题
//		System.out.println("enterName:"+enterName);
		EnterpriseItem enterpriseItem = enterpriseItemService.selectByName(enterName);
		PrintWriter out = res.getWriter();
		if(enterpriseItem != null){
			out.print("failure");
		}else{
			out.print("success");
		}
	}
	
	/**
	 * 验证创业事项的序号重复
	 * @param req
	 * @param res
	 * @throws IOException
	 */
	@RequestMapping(value = "/adminExistItemOrder")
	public void adminExistItemOrder(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		String enterOrder = req.getParameter("enterOrder");
		EnterpriseItem enterpriseItem = enterpriseItemService.selectItemByOrder(enterOrder);
//		System.out.println("enterOrder:"+enterOrder);
		PrintWriter out = res.getWriter();
		if(enterpriseItem != null){
			out.print("failure");
		}else{
			out.print("success");
		}
	}
	
	@RequestMapping(value = "/adminInsertItem")
	public void adminInsertItem(NewsType newsType, HttpServletRequest req, HttpServletResponse res) throws IOException{
				System.out.println("11111111111111111");
		newsService.insert(newsType);
		PrintWriter out = res.getWriter();
		out.print("success");
	}
}

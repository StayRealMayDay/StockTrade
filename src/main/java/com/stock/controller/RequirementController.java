package com.stock.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.pojo.Industry;
import com.stock.pojo.News;
import com.stock.pojo.Relation;
import com.stock.pojo.Requirement;
import com.stock.pojo.User;
import com.stock.service.NewsService;
import com.stock.service.RelationService;
import com.stock.service.RequirementService;

@Controller
public class RequirementController {

	@Autowired
	RequirementService requirementService;
	@Autowired
	NewsService newsService;
	@Autowired 
	RelationService relationService;
	
	
	/**
	 * @author 张玉筱
	 */
	@RequestMapping(value = "/toPublish_req")
	public String newsDetail(Model model,HttpServletRequest req){
		User user = (User) req.getSession().getAttribute("user");
        if (null==user) {
        	System.out.println("用户为空11111111");
        	return "u_login";
		}else {
		List<News> news1 = newsService.selectByNewsType("新闻动态");
        List<News> news2 = newsService.selectByNewsType("行业动态");
        List<News> news3 = newsService.selectByNewsType("政策法规");
        List<Industry> industries = requirementService.selectAllIndustry();
		
		model.addAttribute("news1", news1);
		model.addAttribute("news2", news2);
		model.addAttribute("news3", news3);
		model.addAttribute("industries", industries);
		
		return "publish_req";
		}
	}
	
	/**
	 * @author 张玉筱
	 */
	@RequestMapping(value = "/publishReq")
	public String publish_req(Model model,HttpServletRequest req){
		User userr = (User) req.getSession().getAttribute("user");
	    String user_uuid = userr.getUserUuid();
		String req_name = req.getParameter("req_name");
		String req_brief = req.getParameter("req_brief");
		String req_content = req.getParameter("req_content");
		String req_phone = req.getParameter("req_phone");
		String req_email = req.getParameter("req_email");
		String req_money = req.getParameter("req_money");
		
		Requirement requirement = new Requirement();
		requirement.setReqUuid(UUID.randomUUID().toString());
		requirement.setReqName(req_name);
		requirement.setReqBrief(req_brief);
		requirement.setReqContent(req_content);
		requirement.setReqPhone(req_phone);
		requirement.setReqEmail(req_email);
		requirement.setReqMoney(req_money);
		
		Date now = new Date(); 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		String req_protime = dateFormat.format(now); 
		
		requirement.setReqProtime(req_protime);
		requirement.setUserUuid(user_uuid);
		
		requirementService.insertSelective(requirement);
		
		return "redirect:selectReq";
	}
	/**
	 * 撤销需求
	 * @author 张玉筱
	 */
	@RequestMapping(value = "/deleteReq")
	public String deleteReq(Model model,HttpServletRequest req){
		String reqUuid = req.getParameter("req_uuid");
		requirementService.deleteByPrimaryKey(reqUuid);
		
		return "redirect:userInfo";
	}
	/**
	 * @author 张玉筱
	 */
	@RequestMapping(value = "/selectReq")
	public String selectReq(Model model,HttpServletRequest req){
		
		List<Requirement> reqs = requirementService.selectAllRequirement();
		
		model.addAttribute("reqs", reqs);
		
		return "selectReq";
	}
	/**
	 * @author 张玉筱
	 */
	@RequestMapping(value = "/reqDetail")
	public String reqDetail(Model model,HttpServletRequest req){
		
		String req_uuid = req.getParameter("req_uuid");
		
		Requirement requirement = requirementService.selectByPrimaryKey(req_uuid);
		
		model.addAttribute("requirement", requirement);
		
		return "req_detail";
	}
	
 	/**
	 * 收藏需求
	 * @author 张玉筱
	 */
	@RequestMapping(value = "/focusOnReq")
	public String focusOnReq(HttpServletRequest req){
		/*String pageNum = req.getParameter("pageNum");*/
		String reqUuid = req.getParameter("req_uuid");
		User user = (User) req.getSession().getAttribute("user");
		Relation re = new Relation();
		re.setReqUuid(reqUuid);
		re.setUserUuid(user.getUserUuid());
		Relation r = relationService.checkIsUniqueFocusReq(re);
		
		if(r==null){
			
			re.setReUuid(UUID.randomUUID().toString());
			re.setReType("收藏需求");
			relationService.insertSelective(re);
		}
		
		return "redirect:selectReq";
	}
	/**
	 * 取消收藏需求
	 * @author 张玉筱
	 */
	@RequestMapping(value = "/NofocusOnReq")
	public String NofocusOnReq(HttpServletRequest req){
		
		String reqUuid = req.getParameter("req_uuid");
		User user = (User) req.getSession().getAttribute("user");
		Relation re = new Relation();
		re.setReqUuid(reqUuid);
		re.setUserUuid(user.getUserUuid());
		Relation r = relationService.checkIsUniqueFocusReq(re);
		relationService.deleteByPrimaryKey(r.getReUuid());
		return "redirect:userInfo";
	}
}

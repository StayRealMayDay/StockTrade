package com.stock.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.pojo.EnterpriseItem;
import com.stock.pojo.FileRelation;
import com.stock.pojo.Files;
import com.stock.service.EnterpriseItemService;
import com.stock.service.FileRelationService;
import com.stock.service.FileService;

@Controller
public class EnterpriseItemController {

	@Autowired
	EnterpriseItemService enterpriseItemService;
	@Autowired
	FileRelationService fileRelationService;
	@Autowired
	FileService fileService;
	
	/**
	 * 创业流程展示
	 * @param req
	 * @param res
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/enterpriseItem")
	public String enterpriseItem(HttpServletRequest req, HttpServletResponse res, Model model){
		
		String enterOrder = req.getParameter("enterOrder");
		//流程
		EnterpriseItem enterpriseItem = enterpriseItemService.selectItemByOrder(enterOrder);
		//流程数量
		Integer size = enterpriseItemService.selectItemNum();
		//视频
		List<FileRelation> fileRelation = fileRelationService.selectByObject(enterpriseItem.getEnterUuid());
		List<Files> fileList = new ArrayList<Files>();
		for(int i = 0; i < fileRelation.size(); i++){
			Files file = fileService.selectByPrimaryKey(fileRelation.get(i).getFileUuid());
			fileList.add(file);
		}
		
		model.addAttribute("enterpriseItem", enterpriseItem);
		model.addAttribute("size", size);
		model.addAttribute("fileList", fileList);
		
		return "entrepreneurial_process";
	}
	
	/**
	 * 创业事项
	 * @param req
	 * @param res
	 * @param model
	 */
	@RequestMapping(value="/getEnterpriseItem")
	public void getEnterpriseItem(HttpServletRequest req, HttpServletResponse res, Model model){
		
		String enterOrder = req.getParameter("enterOrder");
		//流程
		EnterpriseItem enterpriseItem = enterpriseItemService.selectItemByOrder(enterOrder);
		//流程数量
		Integer size = enterpriseItemService.selectItemNum();
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("enterpriseItem", enterpriseItem);
		map.put("size", size);
		JSONObject json = JSONObject.fromObject(map);
//		System.out.println("json:\n"+json);
		try {
            /*设置编码格式，返回结果
            * ***/
           res.setContentType( "text/html;charset=UTF-8");
           res.getWriter().write( json.toString());
		} catch (IOException e1) {
           e1.printStackTrace();
		}

	}
}

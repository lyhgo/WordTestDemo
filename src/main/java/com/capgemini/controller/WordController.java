package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capgemini.service.Tool;

@Controller
public class WordController {
	@Autowired
	private Tool tool;
	@RequestMapping("testpoi.do")
	@ResponseBody
	public String getAdminALL(String desc){
		tool.SimpleInsert(desc);
		return "sucess";
	}
}

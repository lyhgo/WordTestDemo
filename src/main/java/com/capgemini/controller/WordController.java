package com.capgemini.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capgemini.service.Tool;

@Controller
public class WordController {
	@Autowired
	private Tool tool;
	@RequestMapping("update.do")
	@ResponseBody
	public String getAdminALL(HashMap resumeInfo){
		System.out.println(resumeInfo);
		return "sucess";
	}
}

package com.kafka.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kafka.demo.dao.CustRepo;
import com.kafka.demo.model.Message;

@Controller
public class CustController
{
	@Autowired
	CustRepo repo;

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	@RequestMapping("/addMessage")
	public String addMsg(Message msg)
	{
		repo.save(msg);
		return "home.jsp";
	}
}

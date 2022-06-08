package com.kafka.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kafka.demo.dao.transactionRepo;
import com.kafka.demo.model.transactionAmt;

@Controller
public class CustController
{
	@Autowired
	transactionRepo repo;

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	@RequestMapping("/addTransaction")
	public String addAmt(transactionAmt amt)
	{
		repo.save(amt);
		return "home.jsp";
	}
}

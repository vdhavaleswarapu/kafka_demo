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
	public String addAmt(final int amt, final String senderID, final String receiverID,final String key, final String currency)
	{
		repo.save(new transactionAmt(amt, senderID,receiverID,key, currency));
		return "home.jsp";
	}
}

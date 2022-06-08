package com.kafka.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.kafka.demo.model.Message;

public interface CustRepo extends CrudRepository<Message,Integer>
{

}

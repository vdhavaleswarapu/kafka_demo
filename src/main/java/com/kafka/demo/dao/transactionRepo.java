package com.kafka.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.kafka.demo.model.transactionAmt;

public interface transactionRepo extends CrudRepository<transactionAmt,Integer>
{

}

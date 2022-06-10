package com.kafka.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.kafka.demo.model.TransactionAmt;

public interface TransactionRepo extends CrudRepository<TransactionAmt,Integer>
{

}

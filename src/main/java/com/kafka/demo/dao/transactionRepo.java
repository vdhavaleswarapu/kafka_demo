package com.kafka.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.kafka.demo.model.TransactionRecord;

public interface TransactionRepo extends CrudRepository<TransactionRecord,Integer>
{

}

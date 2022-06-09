package com.kafka.demo.dao;

import com.kafka.demo.model.baseData;
import org.springframework.data.repository.CrudRepository;


public interface CustRepo extends CrudRepository<baseData,Integer>
{

}

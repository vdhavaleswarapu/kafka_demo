package com.kafka.demo.dao;

import com.kafka.demo.model.BaseData;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepo extends CrudRepository<BaseData,Integer>
{

  List<BaseData> findBycIDAndPin(String senderID, String key);

  List<BaseData> findBycID(String receiverID);
}

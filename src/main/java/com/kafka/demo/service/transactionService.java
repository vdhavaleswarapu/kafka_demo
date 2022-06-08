package com.kafka.demo.service;

import com.kafka.demo.model.transactionAmt;
import java.util.List;
import org.springframework.lang.NonNull;

public class transactionService {

  @NonNull
  private transactionService transactionService;

  public List<transactionAmt> checkAmount(final int amt){


    return transactionService.checkAmount(amt);
  }
}

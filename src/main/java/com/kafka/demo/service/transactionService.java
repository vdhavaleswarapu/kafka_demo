package com.kafka.demo.service;

import com.kafka.demo.model.TransactionAmt;
import java.util.List;
import org.springframework.lang.NonNull;

public class TransactionService {

  @NonNull
  private TransactionService transactionService;

  public List<TransactionAmt> checkAmount(final int amt){


    return transactionService.checkAmount(amt);
  }
}

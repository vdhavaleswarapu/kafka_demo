package com.kafka.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class transactionAmt {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Integer amount;

	protected transactionAmt() {}

	public transactionAmt(final int amount){
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public int getAmount() {
		return amount;
	}


	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + amount + "]";
	}

}

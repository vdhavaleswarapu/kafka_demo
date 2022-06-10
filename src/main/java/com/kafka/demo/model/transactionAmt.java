package com.kafka.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class TransactionAmt {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Integer amount;
	private String senderID;
	private String receiverID;
	private String key;
	private String currency;

	protected TransactionAmt() {}

	public TransactionAmt(final int amount, final String senderID, final String receiverID, final String key, final String currency){
		this.amount = amount;
		this.senderID = senderID;
		this.receiverID = receiverID;
		this.key = key;
		this.currency = currency;
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

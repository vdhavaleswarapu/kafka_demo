package com.kafka.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BaseData {
@Id
	private String cID;
	private String pin;
	private int creditAvailable;
	private String currency;

	public int getCreditAvailable(){
		return creditAvailable;
	}

	public void setCreditAvailable(int creditAvailable){
		this.creditAvailable = creditAvailable;
	}

//	public String getId() {
//		return cID;
//	}
//	public void setId(int aid) {
//		this.id = id;
//	}
//	public String getMsg() {
//		return msg;
//	}
//	public void setMsg(String msg) {
//		this.msg = msg;
//	}
	@Override
	public String toString() {
		return "Message [id=" + cID + ", Credit Available=" + creditAvailable + "]";
	}

}

package com.kafka.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {
@Id
	private int id;
	private String msg;
	public int getId() {
		return id;
	}
	public void setId(int aid) {
		this.id = id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + msg + "]";
	}

}

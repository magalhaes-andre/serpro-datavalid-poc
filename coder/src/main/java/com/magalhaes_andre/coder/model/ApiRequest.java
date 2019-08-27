package com.magalhaes_andre.coder.model;

import java.io.Serializable;

public class ApiRequest implements Serializable{
	private Key key;
	private Answer answer;
	
	public ApiRequest() {}
	
	public ApiRequest(Key key, Answer answer) {
		this.key = key;
		this.answer = answer;
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	
	
}

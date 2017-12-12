package com.example.bean;

import java.io.Serializable;

public class ReverseWordsRestResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private String sentence;
	
	/**
	 * 
	 */
	private int responseCode;
	
	/**
	 * @return
	 */
	public int getResponseCode() {
		return responseCode;
	}

	/**
	 * @param responseCode
	 */
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	/**
	 * @return
	 */
	public String getSentence() {
		return sentence;
	}

	/**
	 * @param sentence
	 */
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
}

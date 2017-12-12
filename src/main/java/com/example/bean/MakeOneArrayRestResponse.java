package com.example.bean;

import java.io.Serializable;
import java.util.List;

public class MakeOneArrayRestResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	private List<Integer> list;
	
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
	public List<Integer> getList() {
		return list;
	}

	/**
	 * @param list
	 */
	public void setList(List<Integer> list) {
		this.list = list;
	}
	
	

}

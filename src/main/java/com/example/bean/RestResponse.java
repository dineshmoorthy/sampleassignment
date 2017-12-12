/**
 * 
 */
package com.example.bean;

import java.io.Serializable;
/**
 * The Class is used to generate the REST response of all REST APIs.
 */
public class RestResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private long number;
	
	/**
	 * 
	 */
	private int responseCode;
	
	/**
	 * @return
	 */
	public long getNumber() {
		return number;
	}

	/**
	 * @param number
	 */
	public void setNumber(long number) {
		this.number = number;
	}

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
}

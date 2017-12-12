package com.example.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class PricingServiceRequest.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RestRequest {

	/**
	 * 
	 */
	@JsonProperty("Array1")
	List<Integer> array1;
	
	/**
	 * 
	 */
	@JsonProperty("Array2")
	List<Integer> array2;
	
	/**
	 * 
	 */
	@JsonProperty("Array3")
	List<Integer> array3;

	/**
	 * @return
	 */
	public List<Integer> getArray1() {
		return array1;
	}

	/**
	 * @param array1
	 */
	public void setArray1(List<Integer> array1) {
		this.array1 = array1;
	}

	/**
	 * @return
	 */
	public List<Integer> getArray2() {
		return array2;
	}

	/**
	 * @param array2
	 */
	public void setArray2(List<Integer> array2) {
		this.array2 = array2;
	}

	/**
	 * @return
	 */
	public List<Integer> getArray3() {
		return array3;
	}

	/**
	 * @param array3
	 */
	public void setArray3(List<Integer> array3) {
		this.array3 = array3;
	}
	
}

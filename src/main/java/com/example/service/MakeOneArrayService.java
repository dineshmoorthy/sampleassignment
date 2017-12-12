package com.example.service;

import java.util.List;

import com.example.model.RestRequest;

/**
 * @author gokulakannanv
 *
 */
public interface MakeOneArrayService {

	/**
	 * @param n
	 * @return
	 */
	List<Integer> makeOneArray(RestRequest restRequest);
	
}

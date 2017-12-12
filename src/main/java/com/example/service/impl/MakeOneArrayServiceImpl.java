package com.example.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.bean.RestResponse;
import com.example.model.RestRequest;
import com.example.service.MakeOneArrayService;
/**
 * This is the Implementation class for MakeOneArrayService
 */
@Service
public class MakeOneArrayServiceImpl implements MakeOneArrayService{
	
	/** The log. */
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * makeOneArray.
	 *
	 * @param List<Integer>
	 * @return the List
	 */
	@Override
	public List<Integer> makeOneArray(RestRequest restRequest) {
		List<Integer> combinedList = new ArrayList<>();
		try {
		combinedList.addAll(restRequest.getArray1());
		combinedList.addAll(restRequest.getArray2());
		combinedList.addAll(restRequest.getArray3());
		}
		catch(Exception ex) {
			log.error("Exception while getting the Arrays " + ex.getMessage());
		}
		List<Integer> newList = new ArrayList<>();
		for (Integer x : combinedList){
			   if (!newList.contains(x))
				   newList.add(x);
			}
		return newList;
	}


}

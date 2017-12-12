package com.example.service.impl;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.example.model.RestRequest;

/**
 * @author gokulakannanv
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class MakeOneArrayServiceImplTest {

	/**
	 * 
	 */
	public MakeOneArrayServiceImpl makeOneArrayService;
	
	/**
	 * setUp
	 */
	@Before
	public void setUp(){
		makeOneArrayService = new MakeOneArrayServiceImpl();
	}
	
	/**
	 * testmakeOneArray
	 * @throws Exception
	 */
	@Test
	public void testmakeOneArray() throws Exception{
		RestRequest restRequest = new RestRequest();
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		restRequest.setArray1(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		restRequest.setArray2(list2);
		
		List<Integer> list3 = new ArrayList<>();
		list3.add(6);
		list3.add(1);
		list3.add(3);
		list3.add(11);
		restRequest.setArray3(list3);
		
		makeOneArrayService.makeOneArray(restRequest);
		
		assertNotNull(makeOneArrayService.makeOneArray(restRequest));
	}
	
	/**
	 * testmakeOneArray
	 * @throws Exception
	 */
	@Test
	public void testmakeOneArray1() throws Exception{
		RestRequest restRequest = new RestRequest();
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(3);
		list1.add(3);
		list1.add(5);
		restRequest.setArray1(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		restRequest.setArray2(list2);
		
		List<Integer> list3 = new ArrayList<>();
		list3.add(6);
		list3.add(1);
		list3.add(3);
		list3.add(11);
		restRequest.setArray3(list3);
		
		makeOneArrayService.makeOneArray(restRequest);
		
		assertNotNull(makeOneArrayService.makeOneArray(restRequest));
	}
}


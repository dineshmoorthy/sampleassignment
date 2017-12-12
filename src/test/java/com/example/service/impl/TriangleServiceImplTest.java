package com.example.service.impl;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author gokulakannanv
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class TriangleServiceImplTest {

	/**
	 * 
	 */
	public TriangleServiceImpl triangleService;
	

	/**
	 * setUp
	 */
	@Before
	public void setUp(){
		triangleService = new TriangleServiceImpl();
	}
	
	/**
	 * testgetReverseWords
	 * @throws Exception
	 */
	@Test
	public void testgetTriangleType() throws Exception{
		int a=1;
		int b=1;
		int c=1;
		triangleService.getTriangleType(a, b, c);
		assertNotNull(triangleService.getTriangleType(a, b, c));
	}
	
	/**
	 * testgetReverseWords
	 * @throws Exception
	 */
	@Test
	public void testgetTriangleType1() throws Exception{
		int a=1;
		int b=2;
		int c=3;
		triangleService.getTriangleType(a, b, c);
		assertNotNull(triangleService.getTriangleType(a, b, c));
	}
}

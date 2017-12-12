package com.example.service.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * The Class FibonacciService.
 *
 * @author vp020k
 */
@RunWith(MockitoJUnitRunner.class)
public class FibonacciServiceImplTest {

	/**
	 * 
	 */
	public FibonacciServiceImpl fibonacciService;
	
	
	/**
	 * setUp
	 */
	@Before
	public void setUp(){
		fibonacciService = new FibonacciServiceImpl();
	}
	
	/**
	 * testretrieveItemPromotions
	 * @throws Exception
	 */
	@Test
	public void testGroupFibonacciList() throws Exception{
		long n = 10;
		fibonacciService.getFibonacciSeries(n);
		assertEquals(55, fibonacciService.getFibonacciSeries(n));
		assertNotNull(fibonacciService.getFibonacciSeries(n));
	}
	
	/**
	 * testretrieveItemPromotions
	 * @throws Exception
	 */
	@Test
	public void testGroupFibonacciListInput() throws Exception{
		long n = 0;
		fibonacciService.getFibonacciSeries(n);
		assertEquals(0, fibonacciService.getFibonacciSeries(n));
		assertNotNull(fibonacciService.getFibonacciSeries(n));
	}
	
	/**
	 * testretrieveItemPromotions
	 * @throws Exception
	 */
	@Test(expected=NullPointerException.class)
	public void testGroupFibonacciListNull() throws Exception{
		long n=(Long) null;
		fibonacciService.getFibonacciSeries(n);
	}
}

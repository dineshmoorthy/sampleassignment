/**
 * 
 */
package com.example.service.impl;

import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.service.FibonacciService;
/**
 * This is the Implementation class for Fibonacci Controller
 */
@Service
public class FibonacciServiceImpl implements FibonacciService{

	/** The log. */
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	/**
	 * Retrieve Fibonacci Series.
	 *
	 * @param n
	 * @return the groupFibonacciList
	 */
	@Override
	public long getFibonacciSeries(long n) {
		log.info("Fibonacci Sequence");
		long result = 0;
		try {
			result = groupFibonacciList(n);
		}
		catch(Exception ex) {
			log.error("Exception while getting the Arrays " + ex.getMessage());
		}
		return result;
	}

	/**
	 * groupFibonacciList
	 * @param n
	 * @return
	 */
	private long groupFibonacciList(long n){

		return Stream.iterate(new long[] {1, 1}, f -> new long[] {f[1], f[0] + f[1]})
				.limit(n)
				.reduce((a, b) -> b)
				.get()[0];
	}

}

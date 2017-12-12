package com.example.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.service.TriangleService;
@Service
public class TriangleServiceImpl implements TriangleService{


	/** The log. */
	private final Logger log = LoggerFactory.getLogger(this.getClass());
		
	/**
		 * Retrieve Triangle Type.
		 *
		 * @param a, b, c
		 * @return the getTriangleType
		 */
	
		@Override
		public String getTriangleType(int a, int b, int c) {
			log.info("Triangle Type");
			String str;
			if((a==b) && (a==c)) {
				str = "Equivalent";
			}
			else {
				str = "Not Equivalent";
			}
			return str;
		}

	
}

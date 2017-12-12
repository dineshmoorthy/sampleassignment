package com.example.service.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.service.ReverseWordsService;
/**
 * This is the Implementation class for Fibonacci Controller
 */
@Service
public class ReverseWordsImpl implements ReverseWordsService{

	/** The log. */
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	/**
	 * Retrieve Fibonacci Series.
	 *
	 * @param n
	 * @return the groupFibonacciList
	 */
	@Override
	public String getReverseWords(String sentence) {
		String[] words = sentence.split(" ");			         
		String reverseString = "";	
		try {
			for (int i = 0; i < words.length; i++) 
			{
				String word = words[i];			             
				String reverseWord = "";			             
				for (int j = word.length()-1; j >= 0; j--) 
				{
					reverseWord = reverseWord + word.charAt(j);
				}			             
				reverseString = reverseString + reverseWord + " ";
			}			         
			log.info(sentence);
			log.info(reverseString);
		}
		catch(Exception ex) {
			log.error("Exception while getting the Arrays " + ex.getMessage());
		}

		return reverseString;
	}

}
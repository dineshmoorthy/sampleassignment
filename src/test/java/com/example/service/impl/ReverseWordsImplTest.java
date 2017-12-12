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
public class ReverseWordsImplTest {

	/**
	 * 
	 */
	public ReverseWordsImpl reverseWords;
	
	/**
	 * setUp
	 */
	@Before
	public void setUp(){
		reverseWords = new ReverseWordsImpl();
	}
	
	/**
	 * testgetReverseWords
	 * @throws Exception
	 */
	@Test
	public void testgetReverseWords() throws Exception{
		String sentence = "How are you";
		reverseWords.getReverseWords(sentence);
		assertNotNull(reverseWords.getReverseWords(sentence));
	}
	
	/**
	 * testgetReverseWords
	 * @throws Exception
	 */
	@Test
	public void testgetReverseWords1() throws Exception{
		String sentence = "";
		reverseWords.getReverseWords(sentence);
		assertNotNull(reverseWords.getReverseWords(sentence));
	}
	
}

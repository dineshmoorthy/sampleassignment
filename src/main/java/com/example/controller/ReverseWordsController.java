/**
 * 
 */
package com.example.controller;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.ReverseWordsRestResponse;
import com.example.service.impl.ReverseWordsImpl;

import javax.ws.rs.core.MediaType;
/**
 * This is the Controller for ReverseWords
 */
@RestController
@RequestMapping("/api")
@Produces({ MediaType.APPLICATION_JSON })
public class ReverseWordsController {

@Autowired
ReverseWordsImpl reverseWords;

/** The log. */
private final Logger log = LoggerFactory.getLogger(this.getClass());

/**
 * Reverse the Words
 *
 * @param n
 * @return the rest response
 */
@GET
@RequestMapping("/ReverseWords")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
@ResponseBody
public ReverseWordsRestResponse getReverseWords(  @QueryParam("sentence")
final String sentence, HttpServletResponse  response) {
	
	log.info("[ReverseWordsController Called. Invoke getReverseWords]");
	
	response.addHeader("pragma", "no-cache");
	/*response.addHeader("content-encoding", "gzip");
	response.addHeader("vary", "Accept-Encoding");
	response.addHeader("cache-control", "no-cache");
	response.addHeader("content-length", "131");*/
	response.addHeader("expires", "-1");
	
	ReverseWordsRestResponse restResponse = new ReverseWordsRestResponse();
	restResponse.setResponseCode(response.getStatus());
	restResponse.setSentence(reverseWords.getReverseWords(sentence));
	return restResponse;
	
}
}

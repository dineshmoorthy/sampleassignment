package com.example.controller;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.MakeOneArrayRestResponse;
import com.example.model.RestRequest;
import com.example.service.impl.MakeOneArrayServiceImpl;

/**
 * This is the Controller for Fibonacci Sequence
 */
@RestController
@RequestMapping("/api")
@Produces({ MediaType.APPLICATION_JSON })
public class MakeOneArrayController {

@Autowired
MakeOneArrayServiceImpl makeOneArrayService;

/** The log. */
private final Logger log = LoggerFactory.getLogger(this.getClass());

/**
 * Retrieve Array.
 *
 * @param restRequest
 * @return the rest response
 */
@POST
@RequestMapping("/makeonearray")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
@ResponseBody
public MakeOneArrayRestResponse makeOneArray(@RequestBody RestRequest restRequest, HttpServletResponse  response) {
	
	log.info("[MakeOneArrayController Called. Invoke getFibonacciSequence]");
	
	response.addHeader("pragma", "no-cache");
//	response.addHeader("content-encoding", "gzip");
//	response.addHeader("vary", "Accept-Encoding");
//	response.addHeader("cache-control", "no-cache");
//	response.addHeader("content-length", "122");
	response.addHeader("expires", "-1");
	
	MakeOneArrayRestResponse restResponse = new MakeOneArrayRestResponse();
	restResponse.setResponseCode(response.getStatus());
	restResponse.setList(makeOneArrayService.makeOneArray(restRequest));
	return restResponse;
	
}

}

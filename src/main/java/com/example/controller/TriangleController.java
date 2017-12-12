package com.example.controller;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.TriangleRestResponse;
import com.example.service.impl.TriangleServiceImpl;
/**
 * This is the Controller for TriangleType
 */
@RestController
@RequestMapping("/api")
@Produces({ MediaType.APPLICATION_JSON })
public class TriangleController {


@Autowired
TriangleServiceImpl triangleService;

/** The log. */
private final Logger log = LoggerFactory.getLogger(this.getClass());

/**
 * Reverse the Words
 *
 * @param n
 * @return the rest response
 */
@GET
@RequestMapping("/TriangleType")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
@ResponseBody
public TriangleRestResponse getReverseWords(  @QueryParam("a")
final int a, @QueryParam("b")
final int b, @QueryParam("c")
final int c, HttpServletResponse  response) {
	
	log.info("[ReverseWordsController Called. Invoke getReverseWords]");
	
	response.addHeader("pragma", "no-cache");
	/*response.addHeader("content-encoding", "gzip");
	response.addHeader("vary", "Accept-Encoding");
	response.addHeader("cache-control", "no-cache");
	response.addHeader("content-length", "131");*/
	response.addHeader("expires", "-1");
	
	TriangleRestResponse restResponse = new TriangleRestResponse();
	restResponse.setResponseCode(response.getStatus());
	restResponse.setMessage(triangleService.getTriangleType(a, b, c));
	return restResponse;
	
}

}

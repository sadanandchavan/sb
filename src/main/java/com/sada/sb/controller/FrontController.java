/**
 * @author sadanandchavan
 *
 * 2024-09-27 8:47:40 pm	
 */
package com.sada.sb.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
@RequestMapping("/sb")
public class FrontController {
	
	Logger logger= LogManager.getLogger(this.getClass());
	
	//http://localhost:8080/sb/healthcheck?msg=java
	@GetMapping("/healthcheck")
	//@RequestMapping(method = RequestMethod.GET, value = "/check")
	public String healthCheck() {
		logger.info("Application is running.");
		return "Up.";
		
	}
	
	@GetMapping("/msg")
	//@RequestMapping(method = RequestMethod.GET, value = "/check")
	public String displayMsg(@RequestParam String msg) {
		logger.info("Application is running.");
		return msg;
		
	}

}

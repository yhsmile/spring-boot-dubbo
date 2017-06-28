package com.zhang.exception;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class AppExceptionHandler {

	private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	@ExceptionHandler
	@ResponseBody
	public String appException(RuntimeException e) {
		log.info("exception{},name:{}","1","2",e);
		return "app error";
	}
}

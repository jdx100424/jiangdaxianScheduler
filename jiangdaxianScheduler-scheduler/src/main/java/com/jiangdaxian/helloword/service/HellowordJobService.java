package com.jiangdaxian.helloword.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HellowordJobService {
	private static final Logger LOG = LoggerFactory.getLogger(HellowordJobService.class);

	public void jobSayHello(int item, int total) {
		LOG.info("jdx:" + item + "," + total);
		System.out.println("jdx:" + item + "," + total);
	}
}

package com.jiangdaxian.helloword.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.jiangdaxian.helloword.service.HellowordJobService;

public class HellowordScheduler implements SimpleJob {
	private static final Logger LOG = LoggerFactory.getLogger(HellowordScheduler.class);

	@Autowired
	private HellowordJobService hellowordJobService;

	public void execute(ShardingContext shardingContext) {
		Integer total = shardingContext.getShardingTotalCount();
		int itemCount = shardingContext.getShardingItem();
		LOG.info("total,{},itemCount,{}", total, itemCount);
		for (int i = 0; i <= itemCount; i++) {
			hellowordJobService.jobSayHello(itemCount, total);
		}
	}
}

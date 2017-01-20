package com.ximelon.melonskin.wxgzh.quartz;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * test
 * @author lijianfeng
 *
 */
//@Component
public class SpringQtz {
	
	private static int count = 0;
	
	//@Scheduled(cron = "0 0/1 * * * ?")
	protected void execute() {
		long ms = System.currentTimeMillis();  
        System.out.println("\t\t" + new Date(ms));  
        System.out.println("(" + count++ + ")"); 
	}

}

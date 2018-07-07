package com.mkyong.common;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloJob implements Job
{
	public void execute(JobExecutionContext context)
	throws JobExecutionException {
		String text = "Quartz is a powerful and advance scheduler framework, to help Java developer to scheduler a job to run at a specified date and time.";
		text = "Quartz, is a open source job scheduling framework, that let you scheduler a task";
		System.out.println(text);	
		
	}
	
}

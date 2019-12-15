package com.learn;

import org.apache.log4j.*;
public class logtest {
	
	static {
		PropertyConfigurator.configure ("C:\\eclipse-workspace\\learn\\conf\\log4j.properties");	
	}
	
	
	private static Logger logger = Logger.getLogger(logtest.class);
	public static void logg(String info) {
		logger.info(info);
		logger.debug(info);
		logger.warn(info);
		logger.error(info);
	}
}

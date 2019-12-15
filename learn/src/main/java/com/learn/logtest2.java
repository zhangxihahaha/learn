package com.learn;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class logtest2 {
	
	
	static {
		DOMConfigurator.configure("C:\\eclipse-workspace\\learn\\conf\\log4j.xml");
	}
	static Logger logger2 = Logger.getLogger(logtest2.class);
	
	public static void test2(String log) {
		
		logger2.debug(log);
		logger2.error(log);
		logger2.warn(log);
		logger2.info(log);
	}

}

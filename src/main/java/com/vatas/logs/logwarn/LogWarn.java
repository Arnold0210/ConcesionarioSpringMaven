package com.vatas.logs.logwarn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.xml.DOMConfigurator;

import com.vatas.interfaces.logs.Logger;

public class LogWarn implements Logger {

	@Override
	public void log(String msg,Class<?> clazz) {
		DOMConfigurator.configure("src/main/resources/dtds/log4j.xml");
		Log log = LogFactory.getLog(clazz);
		log.warn(msg);
	}

}

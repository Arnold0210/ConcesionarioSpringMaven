package logs.logfatal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.xml.DOMConfigurator;

import logs.interfaces.Logger;

public class LogFatal implements Logger {

	@Override
	public void log(String msg, Class<?> clazz) {
		DOMConfigurator.configure("src/main/resources/dtds/log4j.dtd");
		Log log = LogFactory.getLog(clazz);
		log.fatal(msg);
	}

}

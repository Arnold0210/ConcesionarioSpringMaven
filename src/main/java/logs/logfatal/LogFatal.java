<<<<<<< HEAD
package logs.logfatal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.xml.DOMConfigurator;

import logs.interfaces.Logger;

public class LogFatal implements Logger {

	@Override
	public void log(String msg, Class<?> clazz) {
		DOMConfigurator.configure("src/main/resources/dtds/log4j.xml");
		Log log = LogFactory.getLog(clazz);
		log.fatal(msg);
	}

}
=======
package logs.logfatal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.xml.DOMConfigurator;

import logs.interfaces.Logger;

public class LogFatal implements Logger {

	@Override
	public void log(String msg, Class<?> clazz) {
		DOMConfigurator.configure("src/main/resources/dtds/log4j.xml");
		Log log = LogFactory.getLog(clazz);
		log.fatal(msg);
	}

}
>>>>>>> 30c3e4ab3575cb8d0aa5a8713f650d978699753b

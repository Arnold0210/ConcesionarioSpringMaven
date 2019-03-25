package logs.logwarn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import logs.interfaces.Logger;

public class LogWarn implements Logger {

	@Override
	public void log(String msg) {
		Log log = LogFactory.getLog(getClass());
		log.warn(msg);
	}

}

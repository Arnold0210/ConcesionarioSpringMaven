package logs.logerrorfile1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import logs.interfaces.Logger;

public class LogErrorFile1 implements Logger {

	@Override
	public void log(String msg) {
		Log log = LogFactory.getLog(getClass());
		log.error(msg);
	}

}

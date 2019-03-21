package logs.factory;

import logs.debug.DebugLogger;
import logs.interfaces.Logger;
import logs.logerrorfile1.LogErrorFile1;


public class LoggerFactory {
	public static final int ERROR = 1;
	public static final int DEBUG = 2;
	public Logger getLogger(int tipoLog) {
		if(tipoLog == ERROR) {
			return new LogErrorFile1();
		}else if (tipoLog ==DEBUG) {
			return new DebugLogger();
		}
		return null;
	}
}
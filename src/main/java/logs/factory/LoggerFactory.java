package logs.factory;

import logs.debug.DebugLogger;
import logs.info.LogInfo;
import logs.interfaces.Logger;
import logs.logerror.LogError;
import logs.logwarn.LogWarn;

public class LoggerFactory {
	public static final int ERROR = 1;
	public static final int DEBUG = 2;
	public static final int INFO = 3;
	public static final int WARN = 4;

	public Logger getLogger(int tipoLog) {
		if (tipoLog == ERROR) {
			return new LogError();
		} else if (tipoLog == INFO) {
			return new LogInfo();
		} else if (tipoLog == DEBUG) {
			return new DebugLogger();
		} else if (tipoLog == WARN) {
			return new LogWarn();
		}
		return new LogError();
	}
}

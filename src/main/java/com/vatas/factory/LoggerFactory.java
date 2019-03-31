package com.vatas.factory;

import com.vatas.logs.debug.DebugLogger;
import com.vatas.logs.info.LogInfo;
import com.vatas.interfaces.logs.Logger;
import com.vatas.logs.logerror.LogError;
import com.vatas.logs.logfatal.LogFatal;
import com.vatas.logs.logtrace.LogTrace;
import com.vatas.logs.logwarn.LogWarn;

/**
 * @Autor: Arnold Herrera
 * @Date: 31/03/2019
 * @Project: concesionario_spring
 * @FileName:LoggerFactory.java Copyrigt(C) 2019 Todos los derechos reservados.
 */
public class LoggerFactory {
	public static final int ERROR = 1;
	public static final int DEBUG = 2;
	public static final int INFO = 3;
	public static final int WARN = 4;
	public static final int FATAL = 5;
	public static final int TRACE = 6;

	public Logger getLogger(int tipoLog) {
		if (tipoLog == ERROR) {
			return new LogError();
		} else if (tipoLog == INFO) {
			return new LogInfo();
		} else if (tipoLog == DEBUG) {
			return new DebugLogger();
		} else if (tipoLog == WARN) {
			return new LogWarn();
		} else if (tipoLog == FATAL) {
			return new LogFatal();
		} else if (tipoLog == TRACE) {
			return new LogTrace();
		}
		return null;
	}
}

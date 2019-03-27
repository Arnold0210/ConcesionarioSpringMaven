package Tester;

import org.junit.Test;

import logs.factory.LoggerFactory;

public class LoggerTest {

	@Test
	public  void testLogs() {
		LoggerFactory logf = new LoggerFactory();
		logf.getLogger(LoggerFactory.INFO).log("hola",getClass());
		logf.getLogger(LoggerFactory.DEBUG).log("KAREN",getClass());
		logf.getLogger(LoggerFactory.ERROR).log("CRISTHIAN",getClass());
		logf.getLogger(LoggerFactory.WARN).log("BRAYAN Y KAREN ",getClass());
		logf.getLogger(LoggerFactory.FATAL).log("se aman",getClass());
		logf.getLogger(LoggerFactory.TRACE).log("se aman",getClass());
	}

}

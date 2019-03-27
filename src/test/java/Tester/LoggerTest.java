package Tester;

import org.junit.Test;

import logs.factory.LoggerFactory;
import logs.interfaces.Logger;

public class LoggerTest {

	
	public void testCrearCliente() {
		LoggerFactory logf = new LoggerFactory();
		Logger logger = logf.getLogger(LoggerFactory.DEBUG);
		logger.log("DebugGGGER",getClass());
	}
	public static void main(String[] args) {
		LoggerTest lt = new LoggerTest();
		lt.testCrearCliente();
	}
}

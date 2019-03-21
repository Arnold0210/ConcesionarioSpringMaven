package Tester;

import logs.factory.LoggerFactory;
import logs.interfaces.Logger;

public class LoggerTest {

	public static void main(String[] args) {
		LoggerFactory factory = new LoggerFactory();
		Logger logger = factory.getLogger(LoggerFactory.ERROR);
		logger.log("A Message to Log");
	}
}

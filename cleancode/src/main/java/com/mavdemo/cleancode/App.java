package com.mavdemo.cleancode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	public static void main(String[] args) {
		final Logger LOGGER = LogManager.getLogger(App.class);
		LOGGER.info("Entering into Main method");
		SIandCI sici = new SIandCI();
		int si = sici.calculateSI(10000, 3, 5);
		int ci = sici.calculateCI(10000, 0.04, 6, 4);
		LOGGER.info("Exiting from Main method");
	}
}

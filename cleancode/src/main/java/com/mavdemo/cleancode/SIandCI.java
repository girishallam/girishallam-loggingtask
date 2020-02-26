package com.mavdemo.cleancode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SIandCI {
	final Logger LOGGER = LogManager.getLogger(App.class);
	public int calculateSI(int principal, int rateofinterest, int time) {
		LOGGER.info("In the calculateSI method");
		return ((principal * rateofinterest * time) / 100);
	}

	public int calculateCI(int principal, double rateofinterest, int time, int compound) {
		LOGGER.info("In the calculateCI method");
		return (int) ((principal * (1 + (Math.pow((1 + (int) (rateofinterest / compound)), compound * time)))));
	}
}

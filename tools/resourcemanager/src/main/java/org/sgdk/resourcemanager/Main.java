package org.sgdk.resourcemanager;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.sgdk.resourcemanager.ui.ResourceManagerFrame;

public class Main {
	
	private static final Logger logger = LogManager.getLogger(Main.class);
	
	private static final String PROYECTS_SETTINGS_PATH = "C://resourceManager//";

	public static void main(String[] args) {
		try {
			logger.debug("Init Program");
			new ResourceManagerFrame(PROYECTS_SETTINGS_PATH);
		} catch (IOException e) {
			logger.error(e);
		}
	}

}

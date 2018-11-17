package net.javaguides.springmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/logging")
public class HelloWorldController {

	private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);

	@GetMapping("/logs")
	public String index() {

		LOGGER.trace("trace logging");
		LOGGER.debug("debug logging");
		LOGGER.info("info logging");
		LOGGER.warn("warning logging");
		LOGGER.error("error logging", new RuntimeException("help"));
		return "logs";
	}
}

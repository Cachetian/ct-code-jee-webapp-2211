package com.jeewebapp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class JeeContextListener implements ServletContextListener {
  private static final Logger LOGGER = LogManager.getLogger(JeeContextListener.class);

  @Override public void contextInitialized(ServletContextEvent sce) {
    LOGGER.info("JeeContextListener.contextInitialized -> enter init");
    sce.getServletContext().log("Context initialized");
  }

  @Override public void contextDestroyed(ServletContextEvent sce) {
    LOGGER.info("JeeContextListener.contextDestroyed -> enter destroy");
    sce.getServletContext().log("Context destroyed");
  }
}

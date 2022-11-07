package com.jeewebapp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;

@WebListener
public class JeeRequestListener implements ServletRequestListener {
  private static final Logger LOGGER = LogManager.getLogger(JeeRequestListener.class);

  @Override public void requestInitialized(ServletRequestEvent sre) {
    LOGGER.info("JeeReqListener.requestInitialized -> enter requestInitialized");
    sre.getServletContext().log("Request initialized");
  }

  @Override public void requestDestroyed(ServletRequestEvent sre) {
    LOGGER.info("JeeReqListener.requestDestroyed -> enter requestDestroyed");
    sre.getServletContext().log("Request destroyed");
  }
}

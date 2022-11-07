package com.jeewebapp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class JeeSessionListener implements HttpSessionListener {
  private static final Logger LOGGER = LogManager.getLogger(JeeSessionListener.class);

  @Override public void sessionCreated(HttpSessionEvent se) {
    LOGGER.info("JeeSessionListener.sessionCreated -> enter sessionCreated");
    se.getSession().getServletContext().log("Session created");
  }

  @Override public void sessionDestroyed(HttpSessionEvent se) {
    LOGGER.info("JeeSessionListener.sessionDestroyed -> enter sessionDestroyed");
    se.getSession().getServletContext().log("Session destroyed");
  }
}

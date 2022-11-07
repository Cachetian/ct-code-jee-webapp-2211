package com.jeewebapp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/jee")
public class JeeController extends HttpServlet {
  private static final Logger LOGGER = LogManager.getLogger(JeeController.class);

  @Override protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    LOGGER.info("JeeController.doGet -> enter doGet");
    resp.getWriter().println("hello Jee");
  }
}

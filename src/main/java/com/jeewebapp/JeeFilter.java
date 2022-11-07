package com.jeewebapp;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebFilter("*")
public class JeeFilter implements Filter {

  private static final Logger LOGGER = LogManager.getLogger(JeeFilter.class);

  @Override public void init(FilterConfig filterConfig) throws ServletException {
    LOGGER.info("JeeFilter.init -> enter init");
  }

  @Override public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    LOGGER.info("JeeFilter.doFilter -> before filterChain doFilter");
    filterChain.doFilter(servletRequest, servletResponse);
    LOGGER.info("JeeFilter.doFilter -> after filterChain doFilter");
  }

  @Override public void destroy() {
    LOGGER.info("JeeFilter.destroy -> enter destroy");
  }
}

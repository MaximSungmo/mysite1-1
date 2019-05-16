package com.cafe24.mysite.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class ContextLoadListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ContextLoadListener() {

    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
    
    
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent servletContextEvent)  { 
    	String contextConfigLocation = servletContextEvent.getServletContext().getInitParameter("contextConfigLocation");
    	System.out.println("Container Start..........."+contextConfigLocation);
    }
	
}

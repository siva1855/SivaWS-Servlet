package siva.jee.listener.context;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyContextListener implements ServletContextAttributeListener, ServletContextListener {
	
	public void attributeAdded(ServletContextAttributeEvent event) {
		System.out.println("Context Attribute Added :name=" + event.getName() + ",value=" + event.getValue());
	}

	public void attributeRemoved(ServletContextAttributeEvent event) {
		System.out.println("Context Attribute Removed :name=" + event.getName() + ",value=" + event.getValue());
	}

	public void attributeReplaced(ServletContextAttributeEvent event) {
		System.out.println("Context Attribute Replaced :name=" + event.getName() + ",value=" + event.getValue());
	}

	// life cycle
	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("Context Destroyed");
	}

	public void contextInitialized(ServletContextEvent event) {
		System.out.println("Context Initialized");
	}
}

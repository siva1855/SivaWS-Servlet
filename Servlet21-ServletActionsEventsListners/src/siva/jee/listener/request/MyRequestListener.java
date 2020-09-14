package siva.jee.listener.request;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class MyRequestListener implements ServletRequestAttributeListener, ServletRequestListener {
	
	// attribute specific
	public void attributeRemoved(ServletRequestAttributeEvent event) {
		System.out.println("Request Attribute Removed :name=" + event.getName() + ",value=" + event.getValue());
	}

	public void attributeAdded(ServletRequestAttributeEvent event) {
		System.out.println("Request Attribute created :name=" + event.getName() + ",value=" + event.getValue());
	}

	public void attributeReplaced(ServletRequestAttributeEvent event) {
		System.out.println("Request Attribute Replaced :name=" + event.getName() + ",value=" + event.getValue());
	}

	// life cycle
	public void requestDestroyed(ServletRequestEvent event) {
		System.out.println("Request Destroyed");
	}

	public void requestInitialized(ServletRequestEvent event) {
		System.out.println("Request Initialized");
	}
}

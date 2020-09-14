package siva.jee.session.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
@WebListener
public class MySessionListener implements HttpSessionAttributeListener, HttpSessionListener {

	public void attributeAdded(HttpSessionBindingEvent event) {
		System.out.println("Session Attribute Added :name=" + event.getName() + ",value=" + event.getValue());
	}

	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println("Session Attribute Removed :name=" + event.getName() + ",value=" + event.getValue());
	}

	public void attributeReplaced(HttpSessionBindingEvent event) {
		System.out.println("Session Attribute Replaced :name=" + event.getName() + ",value=" + event.getValue());
	}

	public void sessionCreated(HttpSessionEvent event) {
		System.out.println("Session Created");
	}

	public void sessionDestroyed(HttpSessionEvent event) {
		System.out.println("Session Destroyed");
	}
}

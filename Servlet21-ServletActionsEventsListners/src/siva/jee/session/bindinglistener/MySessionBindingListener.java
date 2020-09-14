package siva.jee.session.bindinglistener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

@WebListener
public class MySessionBindingListener implements HttpSessionBindingListener {

	private String mySessionBindingListenerData;

	
	public MySessionBindingListener() {
		super();
	}

	public MySessionBindingListener(String mySessionBindingListenerData) {
		this.mySessionBindingListenerData = mySessionBindingListenerData;
	}

	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("Session Bound:" + event.getName());
	}

	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("Session Unbound:" + event.getName());
	}

	public String getMySessionBindingListenerData() {
		return mySessionBindingListenerData;
	}

	public void setMySessionBindingListenerData(String mySessionBindingListenerData) {
		this.mySessionBindingListenerData = mySessionBindingListenerData;
	}

	
}

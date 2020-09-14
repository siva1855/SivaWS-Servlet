package siva.jee.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterTwo implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		String filterData=filterConfig.getInitParameter("data");
		System.out.println("FilterTwo ---->Init() "+filterData);
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("FilterTwo from doFilter()---> pre-processing");
		filterChain.doFilter(servletRequest, servletResponse);
		System.out.println("FilterTwo from doFilter()---> post-processing");
	}

	public void destroy() {
		System.out.println("FilterTwo ------->destory()");
	}
}

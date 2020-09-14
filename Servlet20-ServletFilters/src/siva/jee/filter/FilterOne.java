package siva.jee.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/sample")
public class FilterOne implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("FilterOne ---->Init()");
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("FilterOne from doFilter()---> pre-processing");
		filterChain.doFilter(servletRequest, servletResponse);
		System.out.println("FilterOne from doFilter()---> post-processing");
	}

	public void destroy() {
		System.out.println("FilterOne ------->destory()");
	}

}

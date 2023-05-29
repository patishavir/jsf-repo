/*    */
package org.primefaces.showcase.filter;

/*    */
/*    */ import java.io.IOException;
/*    */ import javax.servlet.Filter;
/*    */ import javax.servlet.FilterChain;
/*    */ import javax.servlet.FilterConfig;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.ServletRequest;
/*    */ import javax.servlet.ServletResponse;

/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */ public class CharacterEncodingFilter/*    */ implements Filter
/*    */ {
	/*    */ public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		/* 30 */ req.setCharacterEncoding("UTF-8");
		/* 31 */ resp.setCharacterEncoding("UTF-8");
		/* 32 */ chain.doFilter(req, resp);
		/*    */ }

	/*    */
	/*    */ public void init(FilterConfig filterConfig) throws ServletException {
	}

	/*    */
	/*    */ public void destroy() {
	}
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * filter\CharacterEncodingFilter.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */
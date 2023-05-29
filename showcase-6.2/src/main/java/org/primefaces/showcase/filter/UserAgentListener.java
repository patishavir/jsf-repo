/*    */
package org.primefaces.showcase.filter;

/*    */
/*    */ import java.io.IOException;
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.Map;
/*    */ import javax.servlet.Filter;
/*    */ import javax.servlet.FilterChain;
/*    */ import javax.servlet.FilterConfig;
/*    */ import javax.servlet.ServletContext;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.ServletRequest;
/*    */ import javax.servlet.ServletResponse;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import org.primefaces.push.EventBus;
/*    */ import org.primefaces.push.EventBusFactory;

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
/*    */
/*    */
/*    */ public class UserAgentListener/*    */ implements Filter
/*    */ {
	/*    */ private ServletContext context;

	/*    */
	/*    */ public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		/* 40 */ String agent = ((HttpServletRequest) req).getHeader("User-Agent");
		/* 41 */ if (agent != null) {
			/* 42 */ boolean match = false;
			/* 43 */ Map<String, Integer> agents = (Map<String, Integer>) this.context.getAttribute("browserStats");
			/*    */
			/* 45 */ for (Map.Entry<String, Integer> entry : agents.entrySet()) {
				/* 46 */ String key = entry.getKey();
				/* 47 */ if (agent.indexOf(key) != -1) {
					/* 48 */ Integer value = agents.get(key);
					/* 49 */ agents.put(key, value = Integer.valueOf(value.intValue() + 1));
					/* 50 */ match = true;
					/*    */
					/*    */ break;
					/*    */ }
				/*    */ }
			/* 55 */ if (!match) {
				/* 56 */ Integer value = agents.get("Other");
				/* 57 */ agents.put("Other", value = Integer.valueOf(value.intValue() + 1));
				/*    */ }
			/*    */
			/* 60 */ EventBus eventBus = EventBusFactory.getDefault().eventBus();
			/* 61 */ eventBus.publish("/browser", agents);
			/*    */ }
		/*    */
		/* 64 */ chain.doFilter(req, resp);
		/*    */ }

	/*    */
	/*    */ public void init(FilterConfig filterConfig) throws ServletException {
		/* 68 */ Map<String, Integer> agents = new LinkedHashMap<String, Integer>();
		/* 69 */ agents.put("MSIE", Integer.valueOf(0));
		/* 70 */ agents.put("Firefox", Integer.valueOf(0));
		/* 71 */ agents.put("Chrome", Integer.valueOf(0));
		/* 72 */ agents.put("Safari", Integer.valueOf(0));
		/* 73 */ agents.put("Other", Integer.valueOf(0));
		/*    */
		/* 75 */ this.context = filterConfig.getServletContext();
		/* 76 */ this.context.setAttribute("browserStats", agents);
		/*    */ }

	/*    */
	/*    */ public void destroy() {
	}
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * filter\UserAgentListener.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */
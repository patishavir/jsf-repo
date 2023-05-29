/*    */
package org.primefaces.showcase.mobile;

/*    */
/*    */ import java.util.List;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.PrimeFaces;
/*    */ import twitter4j.Query;
/*    */ import twitter4j.Status;
/*    */ import twitter4j.Twitter;
/*    */ import twitter4j.TwitterException;
/*    */ import twitter4j.TwitterFactory;

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
/*    */ @ManagedBean
/*    */ public class TwitterView
/*    */ {
	/*    */ private String keyword;
	/*    */ private List<Status> tweets;

	/*    */
	/*    */ public String getKeyword() {
		/* 38 */ return this.keyword;
		/*    */ }

	/*    */ public void setKeyword(String keyword) {
		/* 41 */ this.keyword = keyword;
		/*    */ }

	/*    */
	/*    */ public List<Status> getTweets() {
		/* 45 */ return this.tweets;
		/*    */ }

	/*    */ public void setTweets(List<Status> tweets) {
		/* 48 */ this.tweets = tweets;
		/*    */ }

	/*    */
	/*    */ public void search() {
		/*    */ try {
			/* 53 */ Twitter twitter = TwitterFactory.getSingleton();
			/* 54 */ Query query = new Query(this.keyword);
			/* 55 */ this.tweets = twitter.search(query).getTweets();
			/* 56 */ } catch (TwitterException exception) {
			/* 57 */ FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Please try again");
			/* 58 */ FacesContext.getCurrentInstance().addMessage(null, msg);
			/* 59 */ PrimeFaces.current().ajax().update(new String[] { "main:messages" });
			/*    */ }
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * mobile\TwitterView.class Java compiler version: 6 (50.0) JD-Core Version:
 * 1.1.3
 */
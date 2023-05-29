/*     */
package org.primefaces.showcase.mobile;

/*     */
/*     */ import com.rometools.rome.feed.synd.SyndEntry;
/*     */ import com.rometools.rome.feed.synd.SyndFeed;
/*     */ import com.rometools.rome.io.SyndFeedInput;
/*     */ import com.rometools.rome.io.XmlReader;
/*     */ import java.io.Reader;
/*     */ import java.io.Serializable;
/*     */ import java.net.URL;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.annotation.PostConstruct;
/*     */ import javax.faces.application.FacesMessage;
/*     */ import javax.faces.bean.ApplicationScoped;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.context.FacesContext;
/*     */ import org.primefaces.showcase.domain.NewsEntry;
/*     */ import org.primefaces.showcase.domain.NewsGroup;

/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */ @ManagedBean
/*     */ @ApplicationScoped
/*     */ public class NewsView/*     */ implements Serializable
/*     */ {
	/*     */ private List<NewsGroup> groups;
	/*     */ private NewsEntry selectedEntry;
	/*     */ private NewsGroup selectedGroup;
	/*     */ private Map<String, String> feeds;

	/*     */
	/*     */ @PostConstruct
	/*     */ public void init() {
		/* 47 */ this.feeds = new HashMap<String, String>();
		/* 48 */ this.feeds.put("Top Stories", "http://feeds.reuters.com/reuters/topNews");
		/* 49 */ this.feeds.put("World", "http://feeds.reuters.com/Reuters/worldNews");
		/* 50 */ this.feeds.put("Technology", "http://feeds.reuters.com/reuters/technologyNews");
		/* 51 */ this.feeds.put("Sports", "http://feeds.reuters.com/reuters/sportsNews");
		/* 52 */ this.feeds.put("Entertainment", " \thttp://feeds.reuters.com/reuters/entertainment");
		/* 53 */ this.feeds.put("Business", "http://feeds.reuters.com/reuters/businessNews");
		/* 54 */ this.feeds.put("Politics", "http://feeds.reuters.com/Reuters/PoliticsNews");
		/*     */
		/* 56 */ this.groups = fetchNews();
		/*     */ }

	/*     */
	/*     */ public List<NewsGroup> getGroups() {
		/* 60 */ return this.groups;
		/*     */ }

	/*     */
	/*     */ public NewsEntry getSelectedEntry() {
		/* 64 */ return this.selectedEntry;
		/*     */ }

	/*     */ public void setSelectedEntry(NewsEntry selectedEntry) {
		/* 67 */ this.selectedEntry = selectedEntry;
		/*     */ }

	/*     */
	/*     */ public NewsGroup getSelectedGroup() {
		/* 71 */ return this.selectedGroup;
		/*     */ }

	/*     */ public void setSelectedGroup(NewsGroup selectedGroup) {
		/* 74 */ this.selectedGroup = selectedGroup;
		/*     */ }

	/*     */
	/*     */ public List<NewsGroup> fetchNews() {
		/* 78 */ List<NewsGroup> news = new ArrayList<NewsGroup>();
		/*     */ try {
			/* 80 */ for (String key : this.feeds.keySet()) {
				/* 81 */ URL feedSource = new URL(this.feeds.get(key));
				/* 82 */ SyndFeedInput input = new SyndFeedInput();
				/* 83 */ SyndFeed feed = input.build((Reader) new XmlReader(feedSource));
				/* 84 */ List<NewsEntry> entries = new ArrayList<NewsEntry>();
				/*     */
				/* 86 */ int i = 0;
				/* 87 */ for (Object f : feed.getEntries()) {
					/* 88 */ SyndEntry entry = (SyndEntry) f;
					/* 89 */ String title = entry.getTitle();
					/* 90 */ title = (title.length() <= 25) ? title : title.substring(0, 25);
					/* 91 */ entries.add(new NewsEntry(i, title + "...", entry.getDescription().getValue()));
					/* 92 */ i++;
					/*     */ }
				/*     */
				/* 95 */ news.add(new NewsGroup(key, entries));
				/*     */ }
			/*     */
			/* 98 */ } catch (Exception exception) {
			/* 99 */ FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Please try again");
			/* 100 */ FacesContext.getCurrentInstance().addMessage(null, msg);
			/*     */ }
		/*     */
		/* 103 */ return news;
		/*     */ }
	/*     */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * mobile\NewsView.class Java compiler version: 6 (50.0) JD-Core Version: 1.1.3
 */
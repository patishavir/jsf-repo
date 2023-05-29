/*    */
package org.primefaces.showcase.mobile;

/*    */
/*    */ import com.rometools.rome.feed.synd.SyndEntry;
/*    */ import com.rometools.rome.feed.synd.SyndFeed;
/*    */ import com.rometools.rome.io.SyndFeedInput;
/*    */ import com.rometools.rome.io.XmlReader;
/*    */ import java.io.Reader;
/*    */ import java.io.Serializable;
/*    */ import java.net.URL;
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.Map;
/*    */ import java.util.logging.Logger;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ViewScoped;

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
/*    */ @ViewScoped
/*    */ public class WeatherView/*    */ implements Serializable
/*    */ {
	/*    */ private String conditions;
	/*    */ private String city;
	/* 37 */ private String unit = "c";
	/*    */
	/*    */ private Map<String, String> cities;
	/* 40 */ private static final Logger logger = Logger
			.getLogger(org.primefaces.showcase.mobile.WeatherView.class.getName());

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 44 */ this.cities = new LinkedHashMap<String, String>();
		/* 45 */ this.cities.put("Istanbul", "TUXX0014");
		/* 46 */ this.cities.put("Barcelona", "SPXX0015");
		/* 47 */ this.cities.put("London", "UKXX0085");
		/* 48 */ this.cities.put("New York", "USNY0996");
		/* 49 */ this.cities.put("Paris", "FRXX2071");
		/* 50 */ this.cities.put("Rome", "ITXX0067");
		/*    */ }

	/*    */
	/*    */ public String getCity() {
		/* 54 */ return this.city;
		/*    */ }

	/*    */ public void setCity(String city) {
		/* 57 */ this.city = city;
		/*    */ }

	/*    */
	/*    */ public String getConditions() {
		/* 61 */ return this.conditions;
		/*    */ }

	/*    */ public void setConditions(String conditions) {
		/* 64 */ this.conditions = conditions;
		/*    */ }

	/*    */
	/*    */ public String getUnit() {
		/* 68 */ return this.unit;
		/*    */ }

	/*    */ public void setUnit(String unit) {
		/* 71 */ this.unit = unit;
		/*    */ }

	/*    */
	/*    */ public Map<String, String> getCities() {
		/* 75 */ return this.cities;
		/*    */ }

	/*    */
	/*    */ public void retrieveConditions() {
		/*    */ try {
			/* 80 */ URL feedSource = new URL(
					"http://weather.yahooapis.com/forecastrss?p=" + this.city + "&u=" + this.unit);
			/* 81 */ SyndFeedInput input = new SyndFeedInput();
			/* 82 */ SyndFeed feed = input.build((Reader) new XmlReader(feedSource));
			/* 83 */ String value = ((SyndEntry) feed.getEntries().get(0)).getDescription().getValue();
			/*    */
			/* 85 */ this.conditions = value.split("<a href")[0];
			/* 86 */ } catch (Exception e) {
			/* 87 */ logger.severe(e.getMessage());
			/* 88 */ this.conditions = "Unable to retrieve weather forecast at the moment.";
			/*    */ }
		/*    */ }

	/*    */
	/*    */ public String saveSettings() {
		/* 93 */ this.conditions = null;
		/* 94 */ return "pm:main";
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * mobile\WeatherView.class Java compiler version: 6 (50.0) JD-Core Version:
 * 1.1.3
 */
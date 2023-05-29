package com.focus.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ThemeSwitcherBean {
	private String theme = "cupertino";
	private static final List<String> themes = new ArrayList<String>(Arrays.asList("afterdark", "afternoon",
			"afterwork", "aristo", "black-tie", "blitzer", "bluesky", "bootstrap", "casablanca", "cruze", "cupertino",
			"dark-hive", "delta", "dot-luv", "eggplant", "excite-bike", "flick", "glass-x", "home", " hot-sneaks",
			"humanity", "le-frog", "midnight", "mint-choc", "overcast", "pepper-grinder", "redmond", "rocket", "sam",
			"smoothness", "south-street", "start", "sunny", "swanky-purse", "themes-project", "trontastic",
			"ui-darkness", "ui-lightness", "vader"));

	public ThemeSwitcherBean() {
		// TODO Auto-generated constructor stub
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public List<String> getThemes() {
		return themes;
	}
}
package com.focus.config;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class ThemeSwitcherView {
	private List<Theme> themes;
	@ManagedProperty("#{themeService}")
	private ThemeService service;

	@PostConstruct
	public void init() {
		this.themes = this.service.getThemes();
	}

	public List<Theme> getThemes() {
		return this.themes;
	}

	public void setService(ThemeService service) {
		this.service = service;
	}
}
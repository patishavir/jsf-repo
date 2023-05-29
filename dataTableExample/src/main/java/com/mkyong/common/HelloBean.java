package com.mkyong.common;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
// @SessionScoped
public class HelloBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	public HelloBean () {
		System.out.println("constructor for HelloBean has completed successfull !");
	}
	public String getName() {
		System.out.println("getName reutrned: " + name);
		return name;
	}

	public void setName(final String name) {
		this.name = name;
		System.out.println("setName name set to: " + name);
	}

}
package oz.jsf.demo;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class HelloBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;

	public HelloBean() {
		System.out.println("constructor for HelloBean has completed successfull !");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
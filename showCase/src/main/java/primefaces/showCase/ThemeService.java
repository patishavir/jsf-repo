package primefaces.showCase;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;



@Named
@ManagedBean
@ApplicationScoped
public class ThemeService {
	private List<String> themes;

	public ThemeService() {
		// TODO Auto-generated constructor stub
	}

	

	public List<String> getThemes() {
		return themes;
	}
}

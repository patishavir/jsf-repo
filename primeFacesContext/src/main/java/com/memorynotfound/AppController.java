package com.memorynotfound;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class AppController {

    private String title;

    @PostConstruct
    public void init(){
        title = FacesContext.getCurrentInstance().getExternalContext().getInitParameter("com.memorynotfound.title");
    }

    public String getTitle() {
        return title;
    }

}

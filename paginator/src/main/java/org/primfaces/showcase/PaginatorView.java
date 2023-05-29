package org.primfaces.showcase;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;

@Named("dtPaginatorView")
@ViewScoped
public class PaginatorView implements Serializable {

	private List<Customer> customers;

	@Inject
	private CustomerService service;

	@PostConstruct
	public void init() {
		customers = service.getCustomers(50);
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setService(CustomerService service) {
		this.service = service;
	}
}
package de.mb.rest.service.customer;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBElement;

import de.mb.rest.service.exceptions.NotFoundException;

@Path("/customers")
public class CustomerService {

	private Map<Long, Customer> model = new HashMap<Long, Customer>();

	// Init model
	public CustomerService() {
		for( int i=0; i<5; i++) {
			Customer c = new Customer();
			c.setCustomerId( new Long(i) );
			c.setFirstName("firstName-"+i);
			c.setLastName("lastName-"+i);
			c.setDateOfBirth( new Date() );
			Address address = new Address();
			address.setCity("Toronto");
			address.setCountry("Canada");
			address.setHouseNumber("42");
			address.setStreet("Young Street");
			c.setAddress(address);
			model.put(new Long( i ), c );
		}
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public Response putTodo(JAXBElement<Customer> customer) {
		model.put(customer.getValue().getCustomerId(), customer.getValue());
		return Response.ok().build();
	}

	/**
	 * http://localhost:8080/server-example/rest/customers/12
	 * 
	 * @param customerid
	 * @return Customer on success, "Customer, 12, is not found" on failure
	 */
	@GET
	@Path("{customerid}")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Customer getCustomer(@PathParam("customerid") Long customerid) {
		Customer customer = model.get( customerid );
		if ( customer == null ) {
			throw new NotFoundException("Customer, " + customerid + ", is not found");
		}
		return customer;
	}

	/**
	 * http://localhost:8080/server-example/rest/customers/
	 * 
	 * @return
	 */
	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Customer> getCustomers() {
		return new ArrayList<Customer>(model.values());
	}

}

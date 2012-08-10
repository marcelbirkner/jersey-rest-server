package de.mb.rest.server.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ping")
public class PingService {

	private String returnValue = "Ping: System OK";

	/**
	 * http://localhost:8080/server-example/rest/ping/
	 * 
	 * @return
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String ping() {
		return returnValue;
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public String pingXml() {
		return "<?xml version=\"1.0\"?>" + "<ping>" + returnValue + "</ping>";
	} 

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String pingHtml() {
		return "<html><title>" + returnValue + "</title>"
				+ "<body><h1>" + returnValue + "</h1></body></html> ";
	}

}

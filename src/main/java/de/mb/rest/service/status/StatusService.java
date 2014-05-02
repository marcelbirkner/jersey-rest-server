package de.mb.rest.service.status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;

/**
 * Returns information of the state of the web application 
 * 
 * @author marcel.birkner
 */
@Path("/status")
@Produces(MediaType.APPLICATION_JSON)
public class StatusService {

	@GET
	public ApplicationStatus getApplicationStatus() {
		ApplicationStatus status = new ApplicationStatus();
		status.setEnvironment(Environment.PRODUCTION);
		status.setStatus(HttpStatus.OK);
		status.setVersion("v1.0");
		return status;
	}

}

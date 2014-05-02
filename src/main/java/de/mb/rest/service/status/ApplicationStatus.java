package de.mb.rest.service.status;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.http.HttpStatus;

/**
 * Status object with details of the deployed webapplication
 * 
 * @author marcel.birkner
 */
@XmlRootElement
public class ApplicationStatus {

	private String version;
	private HttpStatus status;
	private Environment environment;
	/**
	 * Version of the web application
	 * @return version
	 */
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	/**
	 * Status of the web application
	 * @return HttpStatus code
	 */
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	/**
	 * Environment name where the application is deployed
	 * @return environment
	 */
	public Environment getEnvironment() {
		return environment;
	}
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}
}

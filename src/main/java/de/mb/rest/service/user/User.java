package de.mb.rest.service.user;

import java.util.Date;
import java.util.UUID;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * User object
 * 
 * @author marcel.birkner
 *
 */
@XmlRootElement
public class User {
	
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private Date created;
	
	public User() {
	}
	
	public User(String firstName, String lastName, String email, Date created) {
		this.setId(UUID.randomUUID().toString());
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.setCreated(created);
	}
	/**
	 * First name of user
	 * @return firstname
	 */
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * Last name of user
	 * @return lastname
	 */
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * Unique user id
	 * @return user id
	 */
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Email address of user, i.e. mike.smith@company.com
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Creation time of the user account
	 * @return creation date
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * @param created creation date to set
	 */
	public void setCreated(Date created) {
		this.created = created;
	}
}

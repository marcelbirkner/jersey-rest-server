package de.mb.rest.service.user;

import java.util.Date;
import java.util.UUID;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * User Object
 * 
 * @author marcel.birkner
 *
 */
@XmlRootElement
public class User {
	private String id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	
	public User() {
	}
	
	public User(String firstName, String lastName, Date dob) {
		this.setId(UUID.randomUUID().toString());
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dob;
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
	 * Date of birth of user
	 * @return date of birth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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
}

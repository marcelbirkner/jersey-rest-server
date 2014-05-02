package de.mb.rest.service.user;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Transfer object for all users 
 * 
 * @author marcel.birkner
 *
 */
@XmlRootElement
public class UserModel {

	private List<User> users;

	/**
	 * Return List of users
	 * @return list of users
	 */
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}

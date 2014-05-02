package de.mb.rest.service.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.mb.rest.service.exceptions.NotFoundException;

/**
 * The User service allows to manage all users
 * 
 * @author marcel.birkner
 */
@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserService {

	private static List<User> modelList = new ArrayList<User>();

	static {
		modelList.add(new User("Bart", "Simpson", "bart.simpson@simpsons.com", new Date()));
		modelList.add(new User("Marge", "Simpson", "marge.simpson@simpsons.com", new Date()));
		modelList.add(new User("Homer", "Simpson", "homer.simpson@simpsons.com", new Date()));
		modelList.add(new User("Lisa", "Simpson", "lisa.simpson@simpsons.com", new Date()));
		modelList.add(new User("Maggie", "Simpson", "maggie.simpson@simpsons.com", new Date()));
	}

	/**
	 * Creates a new User. Automatically assigns a unique userId 
	 * 
	 * @param user New user that will be added
	 * @return Newly added user
	 */
	@POST
	public User createUser(User user) {
		user.setId(UUID.randomUUID().toString());
		modelList.add(user);
		return user;
	}

	/**
	 * Find user by userId
	 * @param userId identifies the user
	 * @return found user 
	 */
	@GET
	@Path("/{userId}")
	public User getUserById(@PathParam("userId") String userId) {
		for (User user : modelList) {
			if (user.getId().equalsIgnoreCase(userId)) {
				return user;
			}
		}
		throw new NotFoundException("User with id " + userId + " not found");
	}

	/**
	 * Returns a list of all users
	 * @return list of all Users
	 */
	@GET
	@Path("/list")
	public UserModel getAllUsers() {
		UserModel users = new UserModel();
		users.setUsers(modelList);
		return users;
	}
}
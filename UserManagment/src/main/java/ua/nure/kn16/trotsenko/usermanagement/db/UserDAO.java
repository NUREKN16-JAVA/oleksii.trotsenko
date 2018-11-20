package ua.nure.kn16.trotsenko.usermanagement.db;

import java.util.List;

import ua.nure.kn16.trotsenko.usermanagement.User;

public interface UserDAO {
	/**
	 * Add user to DB table USER
	 * @param user with null id field
	 * @return user modified record exemplar with DB auto generated id field 
	 */
	public User create(final User user) throws DatabaseException;
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public User find(Long id);

	/**
	 * 
	 * @return
	 */
	public List<User> findAll();
	
	/**
	 * 
	 * @param user
	 */
	public void update(final User user);
	
	/**
	 * 
	 * @param user
	 */
	public void delete(final User user);

}
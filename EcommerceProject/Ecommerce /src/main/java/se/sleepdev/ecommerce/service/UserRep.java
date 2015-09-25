package se.sleepdev.ecommerce.service;

import se.sleepdev.ecommerce.model.User;

public interface UserRep {
	User addUser(User user) throws RepositryException;

	User removeUser(int userId) throws RepositryException;

	User updateUser(int userID) throws RepositryException;

	User getUser(int userID) throws RepositryException;

}

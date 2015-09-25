package se.sleepdev.ecommerce.service;

import java.util.ArrayList;
import java.util.Map;

import se.sleepdev.ecommerce.model.Order;

public interface OrderRep {

	void createOrder(int userID, Map<Integer, Integer> map) throws RepositryException;

	ArrayList<Order> getUsersOrders(int userID) throws RepositryException;

	Order getOrder(int orderID) throws RepositryException;

	Order updateOrder(int orderID, Order order) throws RepositryException;

	void removeOrder(int orderID) throws RepositryException;
	
	

}

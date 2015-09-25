package se.sleepdev.ecommerce.model;

import java.util.HashMap;
import java.util.Map;


public class Order {

	public Map<Integer, Integer> cart = new HashMap<Integer, Integer>();
	public int orderID;
	public int userID;
	
	public Order(int userID, Map<Integer, Integer> map, int orderID){
		this.userID = userID;
		this.cart = map;
		this.orderID = orderID;
	}
	
	
	public void addProd(int prodID,  int QNT){
		cart.put(prodID, QNT);
	}
	
	public void removeProd(int prodID){
		cart.remove(prodID);
	}

	public Map<Integer, Integer> getCart() {
		return cart;
	}

	public int getOrderID() {
		return orderID;
	}

	public int getUserID() {
		return userID;
	}
	
	
	
}

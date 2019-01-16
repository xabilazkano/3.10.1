package com.zubiri;
import java.util.ArrayList;

public class Users {
	
	private ArrayList<User> users = new ArrayList<User>();
	
	/**
	 * Sets the ArrayList of users
	 * @param users
	 */
	public void setUsers(ArrayList<User> users) {
		this.users=users;
	}
	
	/**
	 * Gets the ArrayList of users
	 * @return
	 */
	public ArrayList<User> getUsers(){
		return this.users;
	}

	/**
	 * Registers a user adding it to the ArrayList
	 * @param user An object of type user
	 */
	public void register(User user) {
		users.add(user);
	}
	
	/**
	 * Changes the password of a logged user
	 * @param username Logged username
	 * @param password New password
	 */
	
	public void changePassword(String username,String password) {
		for (int i=0;i<users.size();i++) {
			if (users.get(i).getUsername().equals(username)) {
				users.get(i).setPassword(password);
			}
		}
		
	}

	/**
	 * Makes the login
	 * @param user username
	 * @param pass password
	 * @return True if correct combination, false if incorrect
	 */
	public boolean login(String user,String pass) {
		boolean verify=false;
		for (int i=0;i<users.size();i++) {
			if (users.get(i).getUsername().equals(user) && users.get(i).getPassword().equals(pass)) {
				verify=true;
			}
		}
		return verify;
		
	}
	
}

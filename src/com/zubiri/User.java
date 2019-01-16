package com.zubiri;

public class User {

	private String username;
	private String password;

	/**
	 * Constructor
	 * 
	 * @param username
	 * @param password
	 */
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	/**
	 * Default constructor
	 */
	public User() {

	}

	/**
	 * Sets the username
	 * 
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Gets the username
	 * 
	 * @return username
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * Sets the password
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the password
	 * 
	 * @return password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Checks if the username meets the conditions
	 * 
	 * @param username
	 * @return true if correct, false if incorrect
	 */
	public boolean verifyUsername(String username) {
		boolean verify = true;
		for (int i = 0; i < username.length(); i++) {
			if (!Character.isLetter(username.charAt(i))) {
				verify = false;
			}
		}
		return verify;
	}

	/**
	 * Checks if the password meets the conditions
	 * 
	 * @param password
	 * @return true if correct, false if incorrect
	 */
	public boolean verifyPassword(String password) {
		boolean letter = false;
		boolean number = false;
		boolean symbol = false;
		boolean length = false;

		if (password.length() > 7) {
			length = true;
		}

		for (int i = 0; i < password.length(); i++) {
			if (Character.isLetter(password.charAt(i))) {
				letter = true;
			}

			if (Character.isDigit(password.charAt(i))) {
				number = true;
			}

			if (!Character.isLetter(password.charAt(i)) && !Character.isDigit(password.charAt(i))) {
				symbol = true;
			}
		}

		if (letter == true && number == true && symbol == true && length == true) {
			return true;
		} else {
			return false;
		}

	}

}

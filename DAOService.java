package com.login_registration.model;

public interface DAOService {
	
	public void connectDB();
	public boolean verifyCredentials(String username, String password);
	public void saveNewRegistration(String name, String city, String  email, Long contact);

}

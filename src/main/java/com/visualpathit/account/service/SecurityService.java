package com.visualpathit.account.service;

/** method for finding already added user !*/
public interface SecurityService {
	/** {@inheritDoc}} !*/
    String findLoggedInUsername();

<<<<<<< HEAD
    void autologin(String username, String password);
=======
    boolean autologin(String username, String password);
>>>>>>> 79694ff (Initial commit for terraform-project)
}

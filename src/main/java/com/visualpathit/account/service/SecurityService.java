package com.visualpathit.account.service;

/** method for finding already added user !*/
public interface SecurityService {
	/** {@inheritDoc}} !*/
    String findLoggedInUsername();

<<<<<<< HEAD
    boolean autologin(String username, String password);
=======
<<<<<<< HEAD
    void autologin(String username, String password);
=======
    boolean autologin(String username, String password);
>>>>>>> 79694ff (Initial commit for terraform-project)
>>>>>>> a53f6c76848e2a3a1cc8af878ad2e32e5c2ff85a
}

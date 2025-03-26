package com.visualpathit.account.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
<<<<<<< HEAD
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
=======
<<<<<<< HEAD
import org.springframework.security.authentication
								   .UsernamePasswordAuthenticationToken;
=======
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
>>>>>>> 79694ff (Initial commit for terraform-project)
>>>>>>> a53f6c76848e2a3a1cc8af878ad2e32e5c2ff85a
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
<<<<<<< HEAD
=======
<<<<<<< HEAD
/** {@author imrant} !*/
@Service
public class SecurityServiceImpl implements SecurityService {
    /** authenticationManager !*/
	@Autowired
    private AuthenticationManager authenticationManager;
	/** userDetailsService !*/
    @Autowired
    private UserDetailsService userDetailsService;

    /** Logger creation !*/
    private static final Logger logger = LoggerFactory
    						.getLogger(SecurityServiceImpl.class);

    @Override
    public String findLoggedInUsername() {
        Object userDetails = SecurityContextHolder.getContext()
        					.getAuthentication().getDetails();
        if (userDetails instanceof UserDetails) {
            return ((UserDetails) userDetails).getUsername();
        }

=======
>>>>>>> a53f6c76848e2a3a1cc8af878ad2e32e5c2ff85a

@Service
public class SecurityServiceImpl implements SecurityService {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsService userDetailsService;

    private static final Logger logger = LoggerFactory.getLogger(SecurityServiceImpl.class);

    @Override
    public String findLoggedInUsername() {
        Object userDetails = SecurityContextHolder.getContext().getAuthentication().getDetails();
        if (userDetails instanceof UserDetails) {
            return ((UserDetails) userDetails).getUsername();
        }
<<<<<<< HEAD
=======
>>>>>>> 79694ff (Initial commit for terraform-project)
>>>>>>> a53f6c76848e2a3a1cc8af878ad2e32e5c2ff85a
        return null;
    }

    @Override
<<<<<<< HEAD
=======
<<<<<<< HEAD
    public void autologin(final String username, final String password) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = 
        new UsernamePasswordAuthenticationToken(userDetails, password, userDetails.getAuthorities());
=======
>>>>>>> a53f6c76848e2a3a1cc8af878ad2e32e5c2ff85a
    public boolean autologin(final String username, final String password) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
                new UsernamePasswordAuthenticationToken(userDetails, password, userDetails.getAuthorities());
<<<<<<< HEAD
=======
>>>>>>> 79694ff (Initial commit for terraform-project)
>>>>>>> a53f6c76848e2a3a1cc8af878ad2e32e5c2ff85a

        authenticationManager.authenticate(usernamePasswordAuthenticationToken);

        if (usernamePasswordAuthenticationToken.isAuthenticated()) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
            SecurityContextHolder.getContext()
            .setAuthentication(usernamePasswordAuthenticationToken);
            logger.debug(String.format("Auto login %s successfully!", username));
        }
=======
>>>>>>> a53f6c76848e2a3a1cc8af878ad2e32e5c2ff85a
            SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            logger.debug(String.format("Auto login %s successfully!", username));
            return true;
        }
        logger.debug(String.format("Auto login %s failed!", username));
        return false;
<<<<<<< HEAD
=======
>>>>>>> 79694ff (Initial commit for terraform-project)
>>>>>>> a53f6c76848e2a3a1cc8af878ad2e32e5c2ff85a
    }
}

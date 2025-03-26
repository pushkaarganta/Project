package com.visualpathit.account.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
<<<<<<< HEAD
import org.springframework.security.authentication
								   .UsernamePasswordAuthenticationToken;
=======
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
>>>>>>> 79694ff (Initial commit for terraform-project)
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
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
>>>>>>> 79694ff (Initial commit for terraform-project)
        return null;
    }

    @Override
<<<<<<< HEAD
    public void autologin(final String username, final String password) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = 
        new UsernamePasswordAuthenticationToken(userDetails, password, userDetails.getAuthorities());
=======
    public boolean autologin(final String username, final String password) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
                new UsernamePasswordAuthenticationToken(userDetails, password, userDetails.getAuthorities());
>>>>>>> 79694ff (Initial commit for terraform-project)

        authenticationManager.authenticate(usernamePasswordAuthenticationToken);

        if (usernamePasswordAuthenticationToken.isAuthenticated()) {
<<<<<<< HEAD
            SecurityContextHolder.getContext()
            .setAuthentication(usernamePasswordAuthenticationToken);
            logger.debug(String.format("Auto login %s successfully!", username));
        }
=======
            SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            logger.debug(String.format("Auto login %s successfully!", username));
            return true;
        }
        logger.debug(String.format("Auto login %s failed!", username));
        return false;
>>>>>>> 79694ff (Initial commit for terraform-project)
    }
}

package com.visualpathit.account.service;

import com.visualpathit.account.model.Role;
import com.visualpathit.account.model.User;
import com.visualpathit.account.repository.UserRepository;
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
>>>>>>> 79694ff (Initial commit for terraform-project)
>>>>>>> a53f6c76848e2a3a1cc8af878ad2e32e5c2ff85a
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
<<<<<<< HEAD
import org.springframework.stereotype.Service;
=======
<<<<<<< HEAD
=======
import org.springframework.stereotype.Service;
>>>>>>> 79694ff (Initial commit for terraform-project)
>>>>>>> a53f6c76848e2a3a1cc8af878ad2e32e5c2ff85a
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;
<<<<<<< HEAD

/** {@author imrant} !*/
@Service
=======
<<<<<<< HEAD
/** {@author imrant} !*/
=======

/** {@author imrant} !*/
@Service
>>>>>>> 79694ff (Initial commit for terraform-project)
>>>>>>> a53f6c76848e2a3a1cc8af878ad2e32e5c2ff85a
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    /** userRepository !*/
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
<<<<<<< HEAD
=======
<<<<<<< HEAD
    public UserDetails loadUserByUsername(final String username) 
    				throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);

=======
>>>>>>> a53f6c76848e2a3a1cc8af878ad2e32e5c2ff85a
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }

<<<<<<< HEAD
=======
>>>>>>> 79694ff (Initial commit for terraform-project)
>>>>>>> a53f6c76848e2a3a1cc8af878ad2e32e5c2ff85a
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for (Role role : user.getRoles()) {
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        }

<<<<<<< HEAD
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
=======
<<<<<<< HEAD
        return new org.springframework.security.core
        		   .userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
=======
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
>>>>>>> 79694ff (Initial commit for terraform-project)
>>>>>>> a53f6c76848e2a3a1cc8af878ad2e32e5c2ff85a
    }
}

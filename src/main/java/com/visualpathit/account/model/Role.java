package com.visualpathit.account.model;

<<<<<<< HEAD
import jakarta.persistence.*;

=======
<<<<<<< HEAD
import javax.persistence.*;
=======
import jakarta.persistence.*;

>>>>>>> 79694ff (Initial commit for terraform-project)
>>>>>>> a53f6c76848e2a3a1cc8af878ad2e32e5c2ff85a
import java.util.Set;
/**{@author imrant} !*/
@Entity
@Table(name = "role")
public class Role {
	/** the id field !*/
    private Long id;
    /** the name field !*/
    private String name;
    /** the user field !*/
    private Set<User> users;
    /** {@inheritDoc}} !*/
    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.IDENTITY)
=======
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.AUTO)
=======
    @GeneratedValue(strategy = GenerationType.IDENTITY)
>>>>>>> 79694ff (Initial commit for terraform-project)
>>>>>>> a53f6c76848e2a3a1cc8af878ad2e32e5c2ff85a
    /**
     * {@link Role#id}
     !*/
    public Long getId() {
        return id;
    }
    /** {@inheritDoc}} !*/
    public  void setId(final Long id) {
        this.id = id;
    }
    /**
     * {@link Role#name}
     !*/
    public String getName() {
        return name;
    }
    /** {@inheritDoc}} !*/
    public  void setName(final String name) {
        this.name = name;
    }
    /**
     * {@inheritDoc}} 
     !*/
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "roles",cascade = CascadeType.ALL)
    /**
     * {@link Role#id}
     !*/
    public Set <User> getUsers() {
        return users;
    }
    /**
     * {@inheritDoc}} 
     !*/
    public final void setUsers(Set<User> users) {
        this.users = users;
    }
}

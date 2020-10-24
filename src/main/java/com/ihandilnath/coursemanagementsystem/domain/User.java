package com.ihandilnath.coursemanagementsystem.domain;

import javax.persistence.*;
import java.util.*;

/**
 * @author Ihan Dilnath
 */
// @MappedSuperclass can't be used since ancestors are associated with other classes
@Entity
@Table(name = "users")
public abstract class User {

    /**
     * Default constructor
     */
    public User() {
    }

    /**
     *
     */
    @Id
    private String email;

    /**
     *
     */
    private char[] password;


}

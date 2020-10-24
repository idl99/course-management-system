package com.ihandilnath.coursemanagementsystem.domain;

import com.ihandilnath.coursemanagementsystem.domain.User;

import javax.persistence.Entity;
import java.util.*;

/**
 * @author Ihan Dilnath
 */
@Entity
public class Student extends User {

    /**
     * Default constructor
     */
    public Student() {
    }

    /**
     *
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

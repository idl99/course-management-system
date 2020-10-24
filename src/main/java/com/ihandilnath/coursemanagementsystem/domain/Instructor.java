package com.ihandilnath.coursemanagementsystem.domain;

import com.ihandilnath.coursemanagementsystem.domain.User;

import javax.persistence.*;
import java.util.*;

/**
 * @author Ihan Dilnath
 */
@Entity
public class Instructor extends User {

    /**
     * Default constructor
     */
    public Instructor() {
    }

    /**
     *
     */
    private String name;



}

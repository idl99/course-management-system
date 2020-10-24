package com.ihandilnath.coursemanagementsystem.domain;

import com.ihandilnath.coursemanagementsystem.domain.User;

import javax.persistence.Entity;
import java.util.*;

/**
 * @author Ihan Dilnath
 * Class to represent the students who make use of the system to view coursework specifications, submit their courseworks and
 * engage with instructors through the discussion forums.
 */
@Entity
public class Student extends User {

    /**
     * Default constructor
     */
    public Student() {
    }

}

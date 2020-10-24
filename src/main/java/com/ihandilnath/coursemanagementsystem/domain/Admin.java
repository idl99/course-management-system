package com.ihandilnath.coursemanagementsystem.domain;

import javax.persistence.Entity;
import java.util.*;

/**
 * @author Ihan Dilnath
 * Class to represent administrator who uses the system to create new modules, register new students and instructors,
 * and enroll them in their respective modules.
 */
@Entity
public class Admin extends User {

    /**
     * Default constructor
     */
    public Admin() {
    }

}

package com.ihandilnath.coursemanagementsystem.domain;

import com.ihandilnath.coursemanagementsystem.domain.User;

import javax.persistence.*;
import java.util.*;

/**
 * @author Ihan Dilnath
 * Class to represent lecturers and tutors who deliver the module to the students
 */
@Entity
public class Instructor extends User {

    /**
     * Default constructor
     */
    public Instructor() {
    }

}

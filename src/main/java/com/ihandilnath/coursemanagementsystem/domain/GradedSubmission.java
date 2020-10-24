package com.ihandilnath.coursemanagementsystem.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.*;

/**
 * @author Ihan Dilnath
 */
@Entity
@Table(name = "gradedSubmissions")
public class GradedSubmission extends CourseworkSubmission {

    /**
     * Default constructor
     */
    public GradedSubmission() {
    }

    /**
     *
     */
    private double grade;

    /**
     *
     */
    private String instructorFeedback;

    /**
     *
     */
    @ManyToOne
    private Instructor gradedBy;


}

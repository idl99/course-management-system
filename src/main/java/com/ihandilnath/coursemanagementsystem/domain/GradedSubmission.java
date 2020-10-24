package com.ihandilnath.coursemanagementsystem.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.*;

/**
 * @author Ihan Dilnath
 */
@Entity
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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getInstructorFeedback() {
        return instructorFeedback;
    }

    public void setInstructorFeedback(String instructorFeedback) {
        this.instructorFeedback = instructorFeedback;
    }

    public Instructor getGradedBy() {
        return gradedBy;
    }

    public void setGradedBy(Instructor gradedBy) {
        this.gradedBy = gradedBy;
    }

}

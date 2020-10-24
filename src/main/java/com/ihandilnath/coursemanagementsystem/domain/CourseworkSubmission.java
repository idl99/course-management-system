package com.ihandilnath.coursemanagementsystem.domain;

import com.ihandilnath.coursemanagementsystem.domain.GradedSubmission;
import com.ihandilnath.coursemanagementsystem.domain.Student;

import java.time.LocalDateTime;
import java.util.*;

/**
 * @author Ihan Dilnath
 */
public class CourseworkSubmission {

    /**
     * Default constructor
     */
    public CourseworkSubmission() {
    }

    /**
     *
     */
    private LocalDateTime submissionDateTime;

    /**
     *
     */
    private String storageUrl;

    /**
     *
     */
    private Student submittedBy;



    /**
     * @param mark
     * @param feedback
     * @return
     */
    public GradedSubmission grade(double mark, String feedback) {
        // TODO implement here
        return null;
    }

}

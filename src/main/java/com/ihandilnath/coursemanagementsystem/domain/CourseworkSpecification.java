package com.ihandilnath.coursemanagementsystem.domain;

import java.time.LocalDateTime;
import java.util.*;

/**
 * @author Ihan Dilnath
 */
public class CourseworkSpecification {

    /**
     * Default constructor
     */
    public CourseworkSpecification() {
    }

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String description;

    /**
     *
     */
    private LocalDateTime deadlineDateTime;

    /**
     *
     */
    private int attemptsAllowed;

    /**
     *
     */
    private List<CourseworkSubmission> submissions;



    /**
     * @param student
     * @param submissionDateTime
     * @param storageUrl
     * @return
     */
    public CourseworkSubmission submitCoursework(Student student, LocalDateTime submissionDateTime, String storageUrl) {
        // TODO implement here
        return null;
    }

}

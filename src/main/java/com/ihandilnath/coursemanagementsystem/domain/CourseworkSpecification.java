package com.ihandilnath.coursemanagementsystem.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.*;

/**
 * @author Ihan Dilnath
 */
@Entity
@Table(name = "courseworkSpecifications")
public class CourseworkSpecification {

    /**
     * Default constructor
     */
    public CourseworkSpecification() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

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
    @OneToMany
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

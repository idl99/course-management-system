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
    private long id;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDeadlineDateTime() {
        return deadlineDateTime;
    }

    public void setDeadlineDateTime(LocalDateTime deadlineDateTime) {
        this.deadlineDateTime = deadlineDateTime;
    }

    public int getAttemptsAllowed() {
        return attemptsAllowed;
    }

    public void setAttemptsAllowed(int attemptsAllowed) {
        this.attemptsAllowed = attemptsAllowed;
    }

    public List<CourseworkSubmission> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(List<CourseworkSubmission> submissions) {
        this.submissions = submissions;
    }
}

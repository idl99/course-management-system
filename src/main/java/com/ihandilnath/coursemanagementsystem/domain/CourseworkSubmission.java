package com.ihandilnath.coursemanagementsystem.domain;

import com.ihandilnath.coursemanagementsystem.domain.GradedSubmission;
import com.ihandilnath.coursemanagementsystem.domain.Student;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.*;

/**
 * @author Ihan Dilnath
 */
@Entity
@Table(name = "courseworkSubmissions")
public class CourseworkSubmission {

    /**
     * Default constructor
     */
    public CourseworkSubmission() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long submissionId;

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
    @ManyToOne
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

    public long getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(long submissionId) {
        this.submissionId = submissionId;
    }

    public LocalDateTime getSubmissionDateTime() {
        return submissionDateTime;
    }

    public void setSubmissionDateTime(LocalDateTime submissionDateTime) {
        this.submissionDateTime = submissionDateTime;
    }

    public String getStorageUrl() {
        return storageUrl;
    }

    public void setStorageUrl(String storageUrl) {
        this.storageUrl = storageUrl;
    }

    public Student getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(Student submittedBy) {
        this.submittedBy = submittedBy;
    }
}

package com.ihandilnath.coursemanagementsystem.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ihandilnath.coursemanagementsystem.domain.GradedSubmission;
import com.ihandilnath.coursemanagementsystem.domain.Student;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.*;

/**
 * @author Ihan Dilnath
 * Class to represent coursework submissions submitted by students for their respective modules.
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
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private long submissionId;

    /**
     *
     */
    private LocalDateTime submissionDateTime;

    /**
     *
     */
    private String content;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Student getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(Student submittedBy) {
        this.submittedBy = submittedBy;
    }
}

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
    private int submissionId;

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

}

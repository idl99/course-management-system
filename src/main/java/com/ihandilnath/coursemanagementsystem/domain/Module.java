package com.ihandilnath.coursemanagementsystem.domain;

import com.ihandilnath.coursemanagementsystem.domain.CourseworkSpecification;

import java.time.LocalDateTime;
import java.util.*;

/**
 * @author Ihan Dilnath
 */
public class Module {

    /**
     * Default constructor
     */
    public Module() {
    }

    /**
     *
     */
    private String moduleCode;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private List<Student> enrolledStudents;

    /**
     *
     */
    private List<Instructor> instructors;

    /**
     *
     */
    private List<DiscussionThread> discussionForum;

    /**
     *
     */
    private List<CourseworkSpecification> courseworks;





    /**
     * @param student
     * @return
     */
    public void enrollStudent(Student student) {
        // TODO implement here
    }

    /**
     * @param instructor
     * @return
     */
    public void registerInstructor(Instructor instructor) {
        // TODO implement here
    }

    /**
     * @param name
     * @param description
     * @param deadlineDateTime
     * @param attemptsAllowed
     * @return
     */
    public CourseworkSpecification createCoursework(String name, String description, LocalDateTime deadlineDateTime, int attemptsAllowed) {
        // TODO implement here
        return null;
    }

}

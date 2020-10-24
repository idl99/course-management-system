package com.ihandilnath.coursemanagementsystem.domain;

import com.ihandilnath.coursemanagementsystem.domain.CourseworkSpecification;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.*;

/**
 * @author Ihan Dilnath
 */
@Entity
@Table(name = "modules")
public class Module {

    /**
     * Default constructor
     */
    public Module() {
    }

    /**
     *
     */
    @Id
    private String moduleCode;

    /**
     *
     */
    private String name;

    /**
     *
     */
    @ManyToMany
    private List<Student> enrolledStudents;

    /**
     *
     */
    @ManyToMany
    private List<Instructor> instructors;

    /**
     *
     */
    @OneToMany
    private List<DiscussionThread> discussionForum;

    /**
     *
     */
    @OneToMany
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

package com.ihandilnath.coursemanagementsystem.domain;

import com.ihandilnath.coursemanagementsystem.domain.Message;

import javax.persistence.*;
import java.util.*;

/**
 * @author Ihan Dilnath
 */
@Entity
@Table(name = "discussionThreads")
public class DiscussionThread {

    /**
     * Default constructor
     */
    public DiscussionThread() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int threadId;


    /**
     *
     */
    @OneToMany
    private List<Message> messages;



    /**
     * @param message
     * @return
     */
    public void postMessage(Message message) {
        // TODO implement here
    }

}
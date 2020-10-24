package com.ihandilnath.coursemanagementsystem.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private long threadId;


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

    public long getThreadId() {
        return threadId;
    }

    public void setThreadId(long threadId) {
        this.threadId = threadId;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

}

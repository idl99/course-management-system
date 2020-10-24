package com.ihandilnath.coursemanagementsystem.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.*;

/**
 * @author Ihan Dilnath
 */
@Entity
@Table(name = "messages")
public class Message {

    /**
     * Default constructor
     */
    public Message() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private int messageId;

    /**
     *
     */
    private String title;

    /**
     *
     */
    private String content;

    /**
     *
     */
    @ManyToOne
    private User author;

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

}

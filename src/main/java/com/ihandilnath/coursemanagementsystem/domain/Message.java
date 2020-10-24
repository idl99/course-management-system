package com.ihandilnath.coursemanagementsystem.domain;

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



}

package com.ihandilnath.coursemanagementsystem.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.*;
import java.util.*;

/**
 * @author Ihan Dilnath
 * Class to represent common attributes and operations of all user types (Admins, Students and Instructors).
 */
// @MappedSuperclass can't be used since ancestors are associated with other classes
@Entity
@Table(name = "users")

// https://www.baeldung.com/jackson-inheritance
// otherwise Jackson won't be able to construct an instance
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Admin.class, name = "admin"),
        @JsonSubTypes.Type(value = Student.class, name = "student"),
        @JsonSubTypes.Type(value = Instructor.class, name = "instructor"),
})
public abstract class User {

    /**
     * Default constructor
     */
    public User() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private long userId;

    /**
     *
     */
    @Column(unique = true)
    private String email;

    /**
     *
     */
    private String name;

    /**
     *
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) // Prevent this field from being exposed in the API response
    private char[] password; // TODO exclude this field from Spring Data Rest in response

    // ================================================================================
    // VERY IMPORTANT: Note, that without getters and setters
    //
    // 1) the Spring Data Rest generated classes won't be able to set values for fields.
    // As a result, request data won't be persisted
    //
    // 2) Springfox Swagger UI won't be able to generate the request templates
    // ================================================================================

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char[] getPassword() {
        return this.password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }
}

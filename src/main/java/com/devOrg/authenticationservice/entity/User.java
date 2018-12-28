package com.devOrg.authenticationservice.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "USER", schema = "public")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, columnDefinition = "serial")
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    public User() {
    }

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User(Date createdOn, String createdBy, Date updatedOn, String updatedBy, Long id, String username, String password) {
        super(createdOn, createdBy, updatedOn, updatedBy);
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}

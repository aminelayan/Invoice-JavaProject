package com.javaproject.Models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

// imports removed for brevity
@Data
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

        @Size(min=3, message="Username must be greater than 3 characters")
        private String username;
        @Size(min=5, message="Password must be greater than 5 characters")
        private String password;
        @Transient
        private String passwordConfirmation;
        private Date createdAt;
        private Date updatedAt;
        @ManyToMany(fetch = FetchType.EAGER)
        @JoinTable(
                name = "users_roles",
                joinColumns = @JoinColumn(name = "user_id"),
                inverseJoinColumns = @JoinColumn(name = "role_id"))
        private List <Role> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User() {
    }
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}



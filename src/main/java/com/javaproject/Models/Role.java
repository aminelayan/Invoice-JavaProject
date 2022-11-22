package com.javaproject.Models;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
// imports removed for brevity
@Entity
@Data
@ToString(exclude = "users")
@Table(name="roles")
public class Role {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "roles")
    private List<User> users;


}


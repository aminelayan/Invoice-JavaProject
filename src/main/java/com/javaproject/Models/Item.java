package com.javaproject.Models;

import lombok.Getter;
import lombok.*;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    @Size(min = 3,max = 20)
    private String name;
    @Column(nullable = false)
    @Min(0)
    private float price;
}

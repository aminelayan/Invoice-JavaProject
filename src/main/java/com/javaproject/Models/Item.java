package com.javaproject.Models;

import lombok.Getter;
import lombok.*;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.List;
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

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "invoices_items",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "invoice_id"))
    private List<Invoice> invoices;

}

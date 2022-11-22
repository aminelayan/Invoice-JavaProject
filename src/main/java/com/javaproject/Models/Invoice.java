package com.javaproject.Models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "invoices")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 20,name = "type_of_invoice")
    private String invoiceType;

    @Column(nullable = false,name = "total")
    private float invoiceTotal;

    @Column( length = 20,name = "file_type")
    private String fileType;

    @Column( length = 500,name = "file_path")
    private String filePath;


    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "invoices_items",
            joinColumns = @JoinColumn(name = "invoice_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id"))
    private List<Item> items;
}

package com.javaproject.Models;

import com.javaproject.enums.InvoiceTypes;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

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

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20,name = "type_of_invoice")
    private InvoiceTypes invoiceType;

    @Column(nullable = false,name = "total")
    private float invoiceTotal;

    @Column(nullable = false, name = "date_of_invoice")
    private LocalDateTime invoiceDate;

    @Column( length = 20,name = "file_type")
    private String fileType;

    @Column( length = 500,name = "file_path")
    private String filePath;


    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}

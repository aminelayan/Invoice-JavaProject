package com.javaproject.Repositories;

import com.javaproject.Models.Invoice;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InvoiceRepository extends CrudRepository<Invoice,Long> {

    List<Invoice> findAll();

    List<Invoice> findAllByUser(Long id);


}

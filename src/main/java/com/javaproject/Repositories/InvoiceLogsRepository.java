package com.javaproject.Repositories;


import com.javaproject.Models.InvoiceLogs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceLogsRepository extends CrudRepository<InvoiceLogs,Long> {
    List<InvoiceLogs> findAllByInvoice_Id(Long invoiceId);
}
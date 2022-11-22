package com.javaproject.Services;

import com.javaproject.Models.Invoice;
import com.javaproject.Models.InvoiceLogs;
import com.javaproject.Models.Item;
//import com.javaproject.Repositories.InvoiceItemsRepository;
import com.javaproject.Repositories.InvoiceRepository;
import com.javaproject.Repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;


    @Autowired
    private ItemRepository itemRepository;



    public List<Invoice> findAll(){
        List<Invoice>  findAllInvoices= invoiceRepository.findAll();
        return findAllInvoices;
    }

    public List<Invoice> findAllInvoiceByID(Long userid){
        List<Invoice> findInvoiceByID = invoiceRepository.findAllByUser(userid);
        return  findInvoiceByID;
    }
    public Invoice findInvoice(Long id) {
        Optional<Invoice> optionalInvoice=invoiceRepository.findById(id);
        if (optionalInvoice.isPresent()) {
            return optionalInvoice.get();
        }
        else {
            return null;
        }
    }

    public Invoice createInvoice(Invoice invoice){
        return invoiceRepository.save(invoice);

    }

    public Invoice updateInvoice(Invoice invoice) {
        Optional<Invoice> invoice1 = invoiceRepository.findById(invoice.getId());
        if (!invoice1.isPresent()) {
            // todo: Return not found jsp
            throw new RuntimeException("invoice not found in the database");
        }
        return invoiceRepository.save(invoice);
    }


    public void deleteInvoice(Long id){
        Invoice deleteToInvoice = findInvoice(id);
        invoiceRepository.delete(deleteToInvoice);
    }

    public List<Item> getItemsOfInvoice(Long id) {
        return itemRepository.findItemsByInvoices(id);
    }



}

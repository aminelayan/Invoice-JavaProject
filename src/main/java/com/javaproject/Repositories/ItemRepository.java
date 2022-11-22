package com.javaproject.Repositories;

import com.javaproject.Models.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Item,Long> {

    List<Item> findItemsByInvoices(Long id);

    List<Item> findAll();

}

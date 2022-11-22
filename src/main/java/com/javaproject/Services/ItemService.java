package com.javaproject.Services;

import com.javaproject.Models.Invoice;
import com.javaproject.Models.Item;
import com.javaproject.Repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public Item createItem(Item item){
        return itemRepository.save(item);
    }


    public Item findItem(Long id) {
        Optional<Item> optionalItem=itemRepository.findById(id);
        if (optionalItem.isPresent()) {
            return optionalItem.get();
        }
        else {
            return null;
        }
    }

    public void deleteItem(Long id){
        Item deleteItem = findItem(id);
        itemRepository.delete(deleteItem);
    }

    public Item editItem(Item item){
        return itemRepository.save(item);
    }

    public List<Item> findAll() {
        List<Item> allItems= itemRepository.findAll();
        return allItems;
    }
}

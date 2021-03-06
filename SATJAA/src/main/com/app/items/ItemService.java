package com.app.items;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.customers.Customer;

@Service
public class ItemService
{
   @Autowired
   private ItemRepository itemRepository;
   
   public List<Item> getAllItems(){
      List<Item> items = new ArrayList<>();
      itemRepository.findAll().forEach(items::add);
      return items;
   }
   
   public Optional<Item> getItem(Double id) {
      return itemRepository.findById(id);
   }
   
   public void addItem(Item item) {
      itemRepository.save(item);
   }
   
   public void updateItem(Double id, Item item) {
      itemRepository.save(item);
   }
   
   public void deleteItem(Double id) {
      itemRepository.deleteById(id);
   }
   
}

package edu.icet.service;

import edu.icet.dto.Customer;
import edu.icet.dto.Item;
import edu.icet.entity.CustomerEntity;
import edu.icet.entity.ItemEntity;
import edu.icet.repository.CustomerDao;
import edu.icet.repository.ItemDao;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService{

    private final ItemDao repository;
    private final ModelMapper mapper;

    @Override
    public List<Item> getAll() {
        List<Item> itemArrayList = new ArrayList<>();
        repository.findAll().forEach(entity->{
            itemArrayList.add(mapper.map(entity, Item.class));
        });
        return itemArrayList;
    }

    @Override
    public void addItem(Item item) {
        repository.save(mapper.map(item, ItemEntity.class));
    }

    @Override
    public void deleteItemById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Item searchItemById(Integer id) {
        return mapper.map(repository.findById(id), Item.class);
    }

    @Override
    public void updateItemById(Item item) {
        repository.save(mapper.map(item,ItemEntity.class));
    }
}

package com.seeker.demo.service;

import com.seeker.demo.dto.ItemDTO;
import com.seeker.demo.entity.Item;
import com.seeker.demo.exception.ItemNotFoundException;
import com.seeker.demo.mapper.ItemMapper;
import com.seeker.demo.repository.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private final ItemRepository repository;

    public ItemService(ItemRepository repository) {
        this.repository = repository;
    }

    public ItemDTO getItemByName(String name) {
        Item item = repository.findByName(name)
                .orElseThrow(() -> new ItemNotFoundException("Item not found: " + name));
        return ItemMapper.toDto(item);
    }

    public ItemDTO createItem(ItemDTO dto) {
        Item saved = repository.save(ItemMapper.toEntity(dto));
        return ItemMapper.toDto(saved);
    }
}

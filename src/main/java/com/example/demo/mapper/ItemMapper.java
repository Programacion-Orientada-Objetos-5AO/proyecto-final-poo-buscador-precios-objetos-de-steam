package com.seeker.demo.mapper;

import com.seeker.demo.dto.ItemDTO;
import com.seeker.demo.entity.Item;

public class ItemMapper {

    public static ItemDTO toDto(Item item) {
        return ItemDTO.builder()
                .name(item.getName())
                .quality(item.getQuality())
                .price(item.getPrice())
                .build();
    }

    public static Item toEntity(ItemDTO dto) {
        return Item.builder()
                .name(dto.getName())
                .quality(dto.getQuality())
                .price(dto.getPrice())
                .build();
    }
}

package com.seeker.demo.service;

import com.example.demo.dto.ItemDTO;
import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

public class ItemServiceTest {

    @Test
    void testGetItemByName() {
        // Arrange (preparación)
        ItemRepository repo = mock(ItemRepository.class);
        Item item = new Item(1L, "Test Item", "Unique", 12.0);

        when(repo.findByName("Test Item")).thenReturn(Optional.of(item));

        ItemService service = new ItemService(repo);

        // Act (acción)
        ItemDTO result = service.getItemByName("Test Item");

        // Assert (verificación)
        assertThat(result).isNotNull();
        assertThat(result.getName()).isEqualTo("Test Item");
        assertThat(result.getQuality()).isEqualTo("Unique");
        assertThat(result.getPrice()).isEqualTo(12.0);
    }
}

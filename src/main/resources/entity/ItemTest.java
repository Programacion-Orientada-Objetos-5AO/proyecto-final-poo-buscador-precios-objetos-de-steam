package com.seeker.demo.entity;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ItemTest {

    @Test
    void testItemBuilder() {
        Item item = Item.builder()
                .name("Strange Rocket Launcher")
                .quality("Strange")
                .price(24.5)
                .build();

        assertThat(item.getName()).isEqualTo("Strange Rocket Launcher");
    }
}

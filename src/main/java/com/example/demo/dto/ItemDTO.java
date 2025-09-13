package com.seeker.demo.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemDTO {
    private String name;
    private String quality;
    private Double price;
}

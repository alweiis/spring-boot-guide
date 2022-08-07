package com.springboot.test.data.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class ChangeProductNameDto {
    private Long number;
    private String name;

    public ChangeProductNameDto(Long number, String name) {
        this.number = number;
        this.name = name;
    }
}

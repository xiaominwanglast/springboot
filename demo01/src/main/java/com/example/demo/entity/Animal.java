package com.example.demo.entity;

import lombok.*;

@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Animal {
    private  String sex;
    private  String name;
    private  Integer id;
}

package com.basictest.practise1;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public final class Employee {
    private String name;
    private int age;
    private String gender;
    private List<String> devices;
}

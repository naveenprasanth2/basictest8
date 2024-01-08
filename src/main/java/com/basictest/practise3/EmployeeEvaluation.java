package com.basictest.practise3;

import java.util.List;

public class EmployeeEvaluation {
    public static void main(String[] args) {
        Employee e1 = Employee.builder().age(20).name("naveen").gender("male").devices(List.of("apple", "iphone", "iphone12", "iphone13")).build();
        Employee e2 = Employee.builder().age(25).name("prasantha").gender("female").devices(List.of("samsung", "galaxy1", "galaxy2", "galaxy13")).build();

        List<Employee> test = List.of(e1, e2);

        e1.setDevices(test.stream().filter(x -> x.getDevices().contains("iphone"))
                .flatMap(x -> x.getDevices().stream())
                .map(x -> x+"summa")
                .toList());

        System.out.println(e1);
    }
}

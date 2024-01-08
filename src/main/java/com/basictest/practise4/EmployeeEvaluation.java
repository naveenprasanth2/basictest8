package com.basictest.practise4;

import java.util.List;

public class EmployeeEvaluation {
    public static void main(String[] args) {
        Employee e1 = Employee.builder().gender("Male").age(20).name("Naveen").devices(List.of("apple", "apple1", "Android", "samsung", "samsung1")).build();
        Employee e2 = Employee.builder().gender("Male").age(20).name("Naveen").devices(List.of("samsung", "lg", "galaxy", "galaxy22", "galaxy24")).build();
        List<Employee> employeeList = List.of(e1, e2);

        List<Employee> test = employeeList.stream().filter(x -> x.getGender().equalsIgnoreCase("male"))
                .filter(x -> x.getDevices().stream().anyMatch(y -> y.contains("samsung")))
                .toList();

        System.out.println(test);
    }
}

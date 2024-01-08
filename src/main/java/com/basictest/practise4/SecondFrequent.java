package com.basictest.practise4;

import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondFrequent {
    public static void main(String[] args) {
        String a = "Banana";

        Stream.of(a.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
                .stream().sorted((x1, x2) -> {
                    if(!Objects.equals(x1.getValue(), x2.getValue())){
                        return ((int) (x2.getValue() - x1.getValue()));
                    }else {
                        return x1.getKey().compareTo(x2.getKey());
                    }
                }).skip(1).findFirst().ifPresent(System.out::println);
    }
}

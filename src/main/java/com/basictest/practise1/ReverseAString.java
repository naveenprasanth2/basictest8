package com.basictest.practise1;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ReverseAString {
    public static void main(String[] args) {
        String a = "Hello Good Morning";

        List<String> test = Stream.of(a.split(" ")).sorted(Collections.reverseOrder()).toList();

        StringBuffer stringBuffer = new StringBuffer();
        test.stream().forEach(x -> stringBuffer.append(x + " "));
        System.out.println(stringBuffer);
    }
}

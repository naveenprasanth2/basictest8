package com.basictest.practise1;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class FindSentence {
    public static void main(String[] args) {
        String a = "naveen is a A good? boy--boy ?testing \\--- test]pannitu iruken pa test8956 -summaa summa" +
                " summa-summa summa- test-panni Paathenhu -a GJHGU HGSYG GUYGS JHGSUYFJYf GHJG VG BBl LL KK HGHGH KKllll hhLLL";

        List<String> sentence = Stream.of(a.split(" "))
                .filter(value -> Pattern.matches("[a-zA-Z]+|[a-zA-Z]+-?[a-zA-Z]+", value)).toList();

        System.out.println(sentence.size());
    }
}

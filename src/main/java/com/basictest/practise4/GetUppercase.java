package com.basictest.practise4;

import java.util.List;
import java.util.stream.Stream;

public class GetUppercase {
    public static void main(String[] args) {
        String a = "naveen is a A good? boy--boy ?testing \\--- test]pannitu iruken pa test8956 -summaa summa" +
                " summa-summa summa- test-panni Paathenhu -a GJHGU HGSYG GUYGS JHGSUYFJYf GHJG VG BBl LL KK HGHGH KKllll hhLLL";

        List<Character> test = Stream.of(a.replaceAll("\\s", "").split(""))
                .map(x -> x.toCharArray()[0]).filter(x -> x > 'A' && x < 'Z').toList();
        System.out.println(test);
    }
}

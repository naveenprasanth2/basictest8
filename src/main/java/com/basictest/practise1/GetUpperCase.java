package com.basictest.practise1;

import java.util.List;
import java.util.stream.Stream;

public class GetUpperCase {
    public static void main(String[] args) {
        String a = "naveen is a A good? boy--boy ?testing \\--- test]pannitu iruken pa test8956 -summaa summa" +
                " summa-summa summa- test-panni Paathenhu -a GJHGU HGSYG GUYGS JHGSUYFJYf GHJG VG BBl LL KK HGHGH KKllll hhLLL";

//        List<Character> test = new String(a.replaceAll("\\s", "").toCharArray()).chars()
//                .mapToObj(i -> (char) i).filter(x -> x > 65 && x < 90).toList();

        List<String> test = Stream.of(a.replaceAll("\\s", "")
                .split("")).filter(x -> x.charAt(0) > 65 && x.charAt(0) < 90).toList();

        System.out.println(test);
    }
}

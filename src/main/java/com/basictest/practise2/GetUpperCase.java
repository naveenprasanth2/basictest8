package com.basictest.practise2;

import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.stream.Stream;

@Log4j2
public class GetUpperCase {
    public static void main(String[] args) {
        String a = "naveen is a A good? boy--boy ?testing \\--- test]pannitu iruken pa test8956 -summaa summa" +
                " summa-summa summa- test-panni Paathenhu -a GJHGU HGSYG GUYGS JHGSUYFJYf GHJG VG BBl LL KK HGHGH KKllll hhLLL";

      List<Character> test =  Stream.of(a.replaceAll("\\s", "").split(""))
                .map(string -> string.toCharArray()[0])
                .filter(Character::isUpperCase)
                .toList();

      log.info(test);
    }
}

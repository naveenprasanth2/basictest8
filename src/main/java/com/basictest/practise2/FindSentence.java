package com.basictest.practise2;

import lombok.extern.log4j.Log4j2;

import java.util.regex.Pattern;
import java.util.stream.Stream;

@Log4j2
public class FindSentence {
    public static void main(String[] args) {
        String a = "naveen is a A good? boy--boy ?testing \\--- test]pannitu iruken pa test8956 -summaa summa" +
                " summa-summa summa- test-panni Paathenhu -a GJHGU HGSYG GUYGS JHGSUYFJYf GHJG VG BBl LL KK HGHGH KKllll hhLLL";

        Stream.of(a.split(" ")).filter(word -> Pattern.matches("[a-zA-Z]+|[a-zA-Z]+-[a-zA-Z]+", word)).forEach(log::info);
    }
}

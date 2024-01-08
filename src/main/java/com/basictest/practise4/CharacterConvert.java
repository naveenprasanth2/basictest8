package com.basictest.practise4;

import java.util.List;

public class CharacterConvert {
    public static void main(String[] args) {
        char[] a = {'a', 's', 'l'};

        List<Character> charList = new String(a).chars().mapToObj(i -> (char) i).toList();
        System.out.println(charList);
    }
}

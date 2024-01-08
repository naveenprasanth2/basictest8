package com.basictest.practise3;

import java.util.List;

public class CharacterCount {
    public static void main(String[] args) {
        char[] a = {'a', 's', 'l'};

        List<Character> test = new String(a).chars().mapToObj(i -> (char)i).toList();

        System.out.println(test.size());
    }
}

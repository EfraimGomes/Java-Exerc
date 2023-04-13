package anagrams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println("is anagram? " + isAnagram("listen", "silent"));

    }

    public static boolean isAnagram(String stringFirst, String stringSecond) {
        List<Character> listFirst = stringFirst.chars()
                .mapToObj(letter -> (char) letter)
                .sorted()
                .collect(Collectors.toList());

        List<Character> listSecond = stringSecond.chars()
                .mapToObj(letter -> (char) letter)
                .sorted()
                .collect(Collectors.toList());

        return listFirst.size() == listSecond.size() && listFirst.equals(listSecond);


    }
}

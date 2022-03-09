package org.example.day5;

import java.util.regex.Pattern;

public class RegulExpress {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[\\p{P}\\s]+", " !" +
                ""));
    }
}

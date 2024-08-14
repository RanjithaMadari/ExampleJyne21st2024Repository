package com.sgtest.programs;

public class DisplayChar {
    public static void main(String[] args) {
        getCharacterbasedindex();
        getnumberofword();
        Display();
        palindrome();
        //printPyramid();//

    }

    static void getCharacterbasedindex() {
        StringBuilder s = new StringBuilder("welcome");
        char ch = s.charAt(3);
        System.out.println("Extracted char:" + ch);
        System.out.println("++++++++++++");
    }

    static void getnumberofword() {
        StringBuilder sentence = new StringBuilder("Bangalore to mysore");
        String str = sentence.toString();
        String[] words = str.split(" ");
        int wordCount = words.length;
        System.out.println("number of words:" + wordCount);
    }

    static void Display() {
        StringBuilder sentence = new StringBuilder("Mysore to bangalore");
        String str = sentence.toString();
        String[] words = str.split(" ");
        StringBuilder reversedsentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedsentence.append(words[i]);
            if (i != 0) {
                reversedsentence.append(" ");
            }
        }
        System.out.println(reversedsentence.toString());
    }

    static void palindrome() {
        StringBuilder word = new StringBuilder("mom");
        String str = word.toString();
        StringBuilder r = new StringBuilder(word);
        String rev = r.reverse().toString();
        if (str.equals(rev)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}







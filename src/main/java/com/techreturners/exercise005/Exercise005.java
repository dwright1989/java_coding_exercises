package com.techreturners.exercise005;

public class Exercise005 {

    final int ALPHABET_LETTER_COUNT = 26;

     public boolean isPangram(String input) {
        input = input.toLowerCase();
        String alphabet = "";
         for(char i='a';i<='z';i++) {
            if(input.indexOf(i)!=-1){
                alphabet+=i;
            }
         }

         return alphabet.length()==ALPHABET_LETTER_COUNT;

    }

}

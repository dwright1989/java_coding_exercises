package com.techreturners.exercise005;

public class Exercise005 {

     public boolean isPangram(String input) {
        boolean isPangram = false;
        input = input.toLowerCase();
        String alphabet = "";
         for(char i='a';i<='z';i++) {
            if(input.indexOf(i)!=-1){
                alphabet+=i;
            }
         }

         if(alphabet.length()==26){
             isPangram = true;
         }
        return isPangram;
    }

}

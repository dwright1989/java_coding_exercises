package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return word.substring(0,1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.charAt(0) + "." + lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        double vatAmount = originalPrice*(vatRate/100);
        return Math.round((originalPrice+vatAmount)*100.0)/100.0;
    }

    public String reverse(String sentence) {
        if(sentence.isEmpty())
            return sentence;
        return reverse(sentence.substring(1)) + sentence.charAt(0);
    }


    public int countLinuxUsers(List<User> users) {
        int linuxUserCount = 0;
        for(User user: users){
            if(user.getType()=="Linux"){
                linuxUserCount++;
            }
        }
        return linuxUserCount;
    }
}

package com.techreturners.exercise003;

public class Exercise003 {

    String[] iceCreamFlavours = {"Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet"};
    int getIceCreamCode(String iceCreamFlavour) {
        for(int i = 0; i < iceCreamFlavours.length; i++){
            if(iceCreamFlavours[i].equals(iceCreamFlavour)){
                return i;
            }
        }
        throw new UnsupportedOperationException(("You can delete this statement and add your code here."));
    }

    String[] iceCreamFlavours() {
        return iceCreamFlavours;
   }

}

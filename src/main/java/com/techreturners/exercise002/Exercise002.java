package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        if(person.getCity()=="Manchester"){
            return true;
        }
        return false;
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        if(person.getAge()>=ageLimit){
            return true;
        }
        return false;
    }
    
}

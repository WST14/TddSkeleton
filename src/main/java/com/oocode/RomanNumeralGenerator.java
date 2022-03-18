package com.oocode;

public class RomanNumeralGenerator {

    public RomanNumeralGenerator(){
        //Constructor
    }

    public String get(int i) {
        if(i == 1) {
            return "I";
        } else if (i == 5) {
            return "V";
        } else {
            return "Not supported";
        }
    }
}

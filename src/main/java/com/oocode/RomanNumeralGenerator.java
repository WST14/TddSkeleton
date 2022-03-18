package com.oocode;

public class RomanNumeralGenerator {

    public RomanNumeralGenerator(){
        //Constructor
    }

    public String get(int i) {

        if (i < 5 && i > 0) {
            if (i == 4) {
                return "IV";
            }
            else {
                String stringOutput = "";
                for (int j  = 0; j < i; j++) {
                    stringOutput += "I";
                }
                return  stringOutput;
            }
        }

        if (i == 5) {
            return "V";
        } else if (i == 10) {
            return "X";
        } else if (i == 50) {
            return "L";
        } else if (i == 100) {
            return "C";
        } else if (i == 500) {
            return "D";
        } else if (i == 1000) {
            return "M";
        } else {
            return "Not supported";
        }
    }
}

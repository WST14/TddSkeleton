package com.oocode;

public class RomanNumeralGenerator {

    public RomanNumeralGenerator(){
        //Constructor
    }

    public String returnValuesForTheBaseSymbol(final int valueWeGoUpTo) {

        String stringOutput = "";

        //For the values that equal the base symbols
        if (valueWeGoUpTo == 5) {
            stringOutput = "";
        }
        if (valueWeGoUpTo == 10) {
            stringOutput = "V";
        }
        return stringOutput;
    }

    public String inbetweenValues(final int i, final int valueWeGoUpTo) {
        String stringOutput = "";

        stringOutput = returnValuesForTheBaseSymbol(valueWeGoUpTo);

        //For the values that equal the base symbols -1
        if (i <= valueWeGoUpTo && i > 0) {
            if (i == valueWeGoUpTo -1) {
                if (valueWeGoUpTo ==5) {
                    return "IV";
                }
                else if (valueWeGoUpTo == 10) {
                    return "IX";
                }
                else return "Not Supported";
            }
            if (i == valueWeGoUpTo) {
                if (valueWeGoUpTo == 5) {
                    return "V";
                }
                else if (valueWeGoUpTo == 10) {
                    return "X";
                }
                else return "Not Supported";
            }
            //For the other values
            else {
                return stringOutput + addINumeralFunctionReturn(valueWeGoUpTo, i);
            }
        }
        return stringOutput;
    }

   public int getValueWeGoUpTo( int theInputNumber) {
        if (theInputNumber <= 5) {
            return 5;
        }
       if (theInputNumber <= 10) {
           return 10;
       }
       return 0;
    }

    public int getValueToRunFrom( int theInputNumber) {
        return 0;

    }

    public String addINumeralFunctionReturn(final int valueWeGoUpTo, final int theInputNumber) {
        String stringOutput = "";
        int valueToRunFrom = 0;
        if (valueWeGoUpTo == 5) {
            valueToRunFrom = 0;
        }
        if (valueWeGoUpTo == 10) {
            valueToRunFrom = 5;
        }
        for (int j  = valueToRunFrom; j < theInputNumber; j++) {
            stringOutput += "I";
        }
        return  stringOutput;

    }

    public String get(final int i) {

        String stringOutput = "";

        if (i < 50) {
            return inbetweenValues(i, getValueWeGoUpTo(i));
        }

        if (i == 50) {
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

package edu.pdx.cs410J.LightRoast;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 * Problems:
 * https://codingdojo.org/kata/FooBarQix/
 * long totalCharacters = exampleString.chars().filter(ch -> ch == '3').count();
 * Names: Ariel Gleason, Brian ONeill, Alex Harris
 *
 */
public class FooBarQix {

    public static void main(String[] args) {
        if (args.length == 0)
            System.err.println("Missing command line arguments");

    }

    public String compute(String number) {
        int num = Integer.parseInt(number);
        String returnString = "";

        returnString += checkMod(num);
        returnString += checkContains(number);

        if (returnString.isEmpty()) {
            number = number.replaceAll("0", "*");
            return number;
        }

        return returnString;
    }

    private String checkMod(int num) {
        String toGo = "";
        if (num % 3 == 0)
            toGo += "Foo";
        if (num % 5 == 0)
            toGo += "Bar";
        if (num % 7 == 0)
            toGo += "Qix";
        return toGo;
    }

    private String checkContains (String number) {
        String toGo = "";
        for (int i = 0; i < number.length(); ++i) {
            if (number.charAt(i) == '3')
                toGo += "Foo";
            if (number.charAt(i) == '5')
                toGo += "Bar";
            if (number.charAt(i) == '7')
                toGo += "Qix";
            if(number.charAt(i) == '0')
                toGo += "*";
        }
        return toGo;
    }

}
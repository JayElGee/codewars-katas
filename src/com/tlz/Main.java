package com.tlz;

public class Main {

    public static void main(String[] args) {

    }

    public static String areYouPlayingBanjo(String name) {
        /*  Create a function which answers the question "Are you playing banjo?".
          If your name starts with the letter "R" or lower case "r", you are playing banjo!

          The function takes a name as its only argument, and returns one of the following strings:

          name + " plays banjo"
          name + " does not play banjo"

          Names given are always valid strings. */

        if (name.startsWith("R") || name.startsWith("r")) {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }

    }

    public static String noSpace(final String x) {
//        Simple, remove the spaces from the string, then return the resultant string.
        return x.replaceAll("\\s", "");
    }

    public static String personalizedMessage(String name, String owner) {
//        Create a function that gives a personalized greeting. This function takes two parameters: name and owner.
//        Use conditionals to return the proper message:
//
//        case	                return
//        name equals owner	    'Hello boss'
//        otherwise	            'Hello guest'

        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }

    public static String greet(String name)
    {
        // Make a function that will return a greeting statement that uses an input; your program should return, "Hello, <name> how are you doing today?".
        return "Hello, " + name + " how are you doing today?";
    }

    public static String boolToWord(boolean b)
    {
//        Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.
        return b ? "Yes" : "No";
    }

    public String dnaToRna(String dna) {
//      Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems. It is composed of four nucleic acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T').
//      Ribonucleic acid, RNA, is the primary messenger molecule in cells. RNA differs slightly from DNA its chemical structure and contains no Thymine. In RNA Thymine is replaced by another nucleic acid Uracil ('U').
//      Create a function which translates a given DNA string into RNA.

        return dna.replace("T", "U");
    }

    public static String hoopCount(int n){
/*  Alex just got a new hula hoop, he loves it but feels discouraged because his little brother is better than him
    Write a program where Alex can input (n) how many times the hoop goes round and it will return him an encouraging message*/
        return n < 10 ? "Keep at it until you get it" : "Great, now move on to tricks";
    }

}


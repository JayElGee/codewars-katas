package com.tlz;

public class Main {

    public static void main(String[] args) {
//        areYouPlayingBanjo("frank");
//        noSpace("hello");
//        personalizedMessage("frank", "tom");
//        greet("frank");
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

}


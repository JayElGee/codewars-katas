package com.tlz;

public class Main {

    public static void main(String[] args) {
        areYouPlayingBanjo("frank");
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
}
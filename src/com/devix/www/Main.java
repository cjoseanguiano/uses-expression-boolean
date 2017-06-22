package com.devix.www;

public class Main {

    public static void main(String[] args) {

        int size = 100;
        String color = "blue";

        boolean largeAndBlue = size >= 50 && color == "blue";

        if (largeAndBlue) {
            System.out.println("Large and blue = " + largeAndBlue);
        }
    }
}

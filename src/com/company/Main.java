package com.company;

public class Main {

    public static void main(String[] args) {
        double value1 = 20;

        double value2 = 80;

        double value3 = (value1 + value2) * 100;
        System.out.println("value3 = " + value3);

        double value4 = value3 % 30;
        System.out.println("value4 = " + value4);

        boolean isRemainer = (value4 == 0) ? true : false;
        System.out.println("isRemainerZero =" + isRemainer);
        if (isRemainer == false){
            System.out.println("Got some Remainder");
        }


    }
}

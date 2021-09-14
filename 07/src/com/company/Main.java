package com.company;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        final double meterConverter=0.09290304;

        System.out.println("What is the length of the room in feet? ");

        Scanner Leninput = new Scanner (System.in);
        String Length = Leninput.next();
        int roomLen = Integer.parseInt(Length);


        System.out.println("What is the Width of the room in feet? ");

        Scanner Widinput = new Scanner (System.in);
        String Width = Widinput.next();
        int roomWid = Integer.parseInt(Width);


        System.out.println("The area is\n");

        int area = roomWid*roomLen;

        System.out.println(area+" square feet");

        double areameter=(area*meterConverter);
        System.out.println(areameter+" square meters");
    }
}
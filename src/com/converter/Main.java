package com.converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Input current course: ");
        Scanner in = new Scanner(System.in);
        double course = in.nextDouble();
        System.out.print("Input sum in rub: ");
        int sumr = in.nextInt();

        System.out.println (convertRuToUsd (sumr, course));

    }

    public static double convertRuToUsd(int sumr, double course) {

        double dollar = sumr / course;
        return dollar;
    }
}
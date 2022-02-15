package com.careerdevs.recursionpractice;

public class CountDown {

    public static void main(String[] args) {
    iterative(10);
    }

    private static void iterative (int countDownFrom) {
        for (int i = 0; i < countDownFrom; i++) {
            System.out.println(i);
        }
    }
}

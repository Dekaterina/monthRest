package ru.netology.javaqa.javaqamvn.services;
//package org.example;

public class Main {
    public static void main(String[] args) {
        CalcService service = new CalcService();
        int myCalc = service.calculate(10_000, 3_000, 20_000);
        System.out.println(myCalc);
    }

}

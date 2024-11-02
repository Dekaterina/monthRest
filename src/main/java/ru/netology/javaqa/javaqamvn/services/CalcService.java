package ru.netology.javaqa.javaqamvn.services;

public class CalcService {
    public int calculate(int income, int expenses, int threshold) {
        int i = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (threshold < money) {
                i++;
                money = (money - expenses) / 3;

            } else {
                money = money + income - expenses;

            }
        }
        return i;
    }
}





package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//import org.example.CalcService;
public class CalcServiceTest {

    @Test
    public void shouldCalculateForMonthOfRest() {
        CalcService service = new CalcService();
        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForMonthOfRestForLargeParams() {
        CalcService service = new CalcService();
        int expected = 2;
        int actual = service.calculate(100000, 60000, 150000);
        Assertions.assertEquals(expected, actual);
    }
}
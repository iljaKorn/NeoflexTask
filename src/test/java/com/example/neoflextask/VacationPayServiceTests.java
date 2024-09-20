package com.example.neoflextask;

import com.example.neoflextask.service.VacationPayService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationPayServiceTests {

    @Test
    public void calculateVacationPay(){
        VacationPayService vacationPayService = new VacationPayService();
        double averageSalary = 20000;
        int numberDays = 12;
        assertEquals(vacationPayService.calculateVacationPay(averageSalary, numberDays), 8191);
    }
}

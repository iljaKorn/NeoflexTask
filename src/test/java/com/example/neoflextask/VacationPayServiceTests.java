package com.example.neoflextask;

import com.example.neoflextask.service.VacationPayService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationPayServiceTests {

    @Test
    public void calculateVacationPay(){
        VacationPayService vacationPayService = new VacationPayService();
        double avgSalary = 20000;
        int numOfDays = 12;
        assertEquals(vacationPayService.calculateVacationPay(avgSalary, numOfDays), 8191);
    }

    @Test
    public void calculateVacationPayFromDateWithoutHolidays(){
        VacationPayService vacationPayService = new VacationPayService();
        double avgSalary = 20000;
        int numOfDays = 12;
        LocalDate date = LocalDate.of(2022, 8, 10);
        assertEquals(vacationPayService.calculateVacationPayFromDate(avgSalary, numOfDays, date), 8191);
    }
    @Test
    public void calculateVacationPayFromDateWithHolidays(){
        VacationPayService vacationPayService = new VacationPayService();
        double avgSalary = 20000;
        int numOfDays = 12;
        LocalDate date = LocalDate.of(2022, 5, 1);
        assertEquals(vacationPayService.calculateVacationPayFromDate(avgSalary, numOfDays, date), 6826);
    }
}

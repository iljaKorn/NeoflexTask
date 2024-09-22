package com.example.neoflextask.controller;

import com.example.neoflextask.service.VacationPayService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
public class VacationPayController {
    private final VacationPayService vacationPayService;

    public VacationPayController(VacationPayService vacationPayService) {
        this.vacationPayService = vacationPayService;
    }

    @GetMapping(value = "/calculacte", params = {"avgSalary", "numOfDays"})
    public Double calculateVacationPay(@RequestParam double avgSalary, @RequestParam int numOfDays) {
        return vacationPayService.calculateVacationPay(avgSalary, numOfDays);
    }

    @GetMapping(value = "/calculacte", params = {"avgSalary", "numOfDays", "startDate"})
    public Double calculateVacationPay(@RequestParam double avgSalary, @RequestParam int numOfDays, @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate) {
        return vacationPayService.calculateVacationPayFromDate(avgSalary, numOfDays, startDate);
    }

}

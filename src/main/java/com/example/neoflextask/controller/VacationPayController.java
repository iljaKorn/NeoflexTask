package com.example.neoflextask.controller;

import com.example.neoflextask.service.VacationPayService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VacationPayController {
    private final VacationPayService vacationPayService;

    public VacationPayController(VacationPayService vacationPayService){
        this.vacationPayService = vacationPayService;
    }
    @GetMapping("/calculacte")
    public Double calculateVacationPay(@RequestParam double avgSalary, @RequestParam int numOfDays){
        return vacationPayService.calculateVacationPay(avgSalary, numOfDays);
    }
}

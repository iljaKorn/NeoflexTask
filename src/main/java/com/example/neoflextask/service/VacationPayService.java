package com.example.neoflextask.service;

import org.springframework.stereotype.Service;

@Service
public class VacationPayService {
    public double calculateVacationPay(double avgMountSalary, int numOfDays){
        double dailySalary = avgMountSalary / 29.3;
        return Math.round(dailySalary * numOfDays);
    }
}

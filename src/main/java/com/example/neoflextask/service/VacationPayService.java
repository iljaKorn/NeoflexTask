package com.example.neoflextask.service;

import de.focus_shift.jollyday.core.Holiday;
import de.focus_shift.jollyday.core.HolidayCalendar;
import de.focus_shift.jollyday.core.HolidayManager;
import de.focus_shift.jollyday.core.ManagerParameters;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Set;

@Service
public class VacationPayService {
    public double calculateVacationPay(double avgSalary, int numOfDays) {
        double dailySalary = avgSalary / 29.3;
        return Math.round(dailySalary * numOfDays);
    }

    public double calculateVacationPayFromDate(double avgSalary, int numOfDays, LocalDate startDate) {
        HolidayManager holidayManager = HolidayManager.getInstance(ManagerParameters.create(HolidayCalendar.RUSSIA));
        Set<Holiday> holidays = holidayManager.getHolidays(startDate, startDate.plusDays(numOfDays));
        int numOfHolidays = holidays.size();

        double dailySalary = avgSalary / 29.3;
        return Math.round(dailySalary * (numOfDays - numOfHolidays));
    }
}

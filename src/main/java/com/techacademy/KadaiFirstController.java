package com.techacademy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

//曜日取得
    @GetMapping("/dayofweek/{val1}")
    public String dispDayOfWeek(@PathVariable String val1) {
        String dateString = val1;
        LocalDate ld = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyyMMdd"));
        LocalDateTime day = ld.atStartOfDay();
        DayOfWeek dayof = day.getDayOfWeek();
        String week = String.valueOf(dayof);
        return week;
    }

//足し算
    @GetMapping("/plus/{val1}/{val2}")
    public int calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return res;
    }

//引き算
    @GetMapping("/minus/{val1}/{val2}")
    public int calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return res;
    }

//掛け算
    @GetMapping("/times/{val1}/{val2}")
    public int calcTime(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return res;
    }

//割り算
    @GetMapping("/divide/{val1}/{val2}")
    public int calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return res;
    }
}

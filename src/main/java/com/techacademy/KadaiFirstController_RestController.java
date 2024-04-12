package com.techacademy;

import java.util.Calendar;
import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController_RestController {

    @GetMapping("/dayofweek/{val1}")
    public String dispDayOfWeek(@PathVariable String val1) {
        Calendar cal = Calendar.getInstance();
        String strDate = val1;
        int year = Integer.parseInt(strDate.substring(0, 4));
        int month = Integer.parseInt(strDate.substring(4, 6));
        int day = Integer.parseInt(strDate.substring(6, 8));
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month -1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH);
        return dayOfWeek;
    }

    @GetMapping("/plus/{val1}/{val2}")
    public int calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return res;
    }

    @GetMapping("/minus/{val1}/{val2}")
    public int calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return res;
    }

    @GetMapping("/times/{val1}/{val2}")
    public int calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return res;
    }

    @GetMapping("/divide/{val1}/{val2}")
    public int calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return res;
    }

}

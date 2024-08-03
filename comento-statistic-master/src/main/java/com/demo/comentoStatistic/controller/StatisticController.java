package com.demo.comentoStatistic.controller;

import com.demo.comentoStatistic.dto.AvgDayLoginCountDto;
import com.demo.comentoStatistic.dto.DepartmentMonthLoginDto;
import com.demo.comentoStatistic.dto.YearCountDto;
import com.demo.comentoStatistic.dto.YearCountExceptHolidayDto;
import com.demo.comentoStatistic.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StatisticController {

    @Autowired
    StatisticService statisticService;

    // 년도별 로그인 수
    @RequestMapping(value="/api/v1/logins/{year}", produces = "application/json")
    @ResponseBody
    public ResponseEntity<YearCountDto> getYearLoginCount(@PathVariable("year") String year){

        return ResponseEntity.ok(statisticService.getYearLogins(year));
    }

    // 월별 로그인 수
    @RequestMapping(value="/api/v1/logins/{year}/{month}", produces = "application/json")
    @ResponseBody
    public Object getYearMonthLoginCount(@PathVariable("year") String year, @PathVariable("month") String month){

        return ResponseEntity.ok(statisticService.getYearMonthLogins(year, month));
    }

    // 평균 하루 로그인 수
    @RequestMapping(value="/api/v1/avg-logins/{year}/{month}", produces = "application/json")
    @ResponseBody
    public ResponseEntity<AvgDayLoginCountDto> getAvgDayLoginCount(@PathVariable("year") String year, @PathVariable("month") String month){
        return ResponseEntity.ok(statisticService.getAvgDayLogins(year, month));
    }
    // 휴일을 제외한 로그인 수

    @RequestMapping(value="/api/v1/ex-holiday-logins/{year}", produces = "application/json")
    @ResponseBody
    public ResponseEntity<YearCountExceptHolidayDto> getNonHolidayLoginCount(@PathVariable("year") String year) {
        return ResponseEntity.ok(statisticService.getYearExceptHolidayLogins(year));
    }

    // 부서별 월별 로그인 수
    @RequestMapping(value="/api/v1/department-logins/{year}/{month}", produces = "application/json")
    @ResponseBody
    public ResponseEntity<DepartmentMonthLoginDto> getDepartmentMonthLoginCount(@PathVariable("year") String year, @PathVariable("month") String month){
        return ResponseEntity.ok(statisticService.getDepartmentMonthLogins(year, month));
    }
}


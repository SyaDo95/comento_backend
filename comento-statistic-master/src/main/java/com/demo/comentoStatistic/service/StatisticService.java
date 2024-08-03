package com.demo.comentoStatistic.service;

import com.demo.comentoStatistic.dao.StatisticMapper;
import com.demo.comentoStatistic.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatisticService {


    @Autowired
    StatisticMapper statisticMapper;

    public YearCountDto getYearLogins(String year){

        return statisticMapper.selectYearLogin(year);
    }

    public YearMonthCountDto getYearMonthLogins(String year, String month){

        return statisticMapper.selectYearMonthLogin(year+month);
    }

    public AvgDayLoginCountDto getAvgDayLogins(String year, String month){

        return statisticMapper.selectAvgDayLogins(year+month);
    }

    public YearCountExceptHolidayDto getYearExceptHolidayLogins(String year){

        return statisticMapper.selectYearExceptHolidayLogins(year);
    }

    public DepartmentMonthLoginDto getDepartmentMonthLogins(String year, String month){
        return statisticMapper.selectDepartmentMonthLogins(year + month);
    }



}

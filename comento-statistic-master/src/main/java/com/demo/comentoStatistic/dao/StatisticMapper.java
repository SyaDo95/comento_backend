package com.demo.comentoStatistic.dao;

import com.demo.comentoStatistic.dto.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.HashMap;


@Mapper
public interface StatisticMapper {

   YearCountDto selectYearLogin(String year);
   YearMonthCountDto selectYearMonthLogin(String yearMonth);
   AvgDayLoginCountDto selectAvgDayLogins(String yearMonth);
   YearCountExceptHolidayDto selectYearExceptHolidayLogins(String yearMonth);
   DepartmentMonthLoginDto selectDepartmentMonthLogins(String yearMonth);
}
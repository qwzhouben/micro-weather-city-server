package com.zben.cloud.weather.controller;

import com.zben.cloud.weather.service.CityDataService;
import com.zben.cloud.weather.vo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * City Controller.
 *
 * @since 1.0.0 2017年11月22日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    CityDataService cityDataService;

    @GetMapping
    public List<City> listCity() throws Exception {
        return cityDataService.listCity();
    }
}
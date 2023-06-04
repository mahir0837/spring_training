package com.cydeo.client;

import com.cydeo.dto.weather.WeatherDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "http://api.weatherstack.com",name = "WEATHER-CLIENT")
public interface WeatherApiClient {

    //http://api.weatherstack.com/current?access_key=d0b882f54e31fee3bbbea35dc4dfe761&query=London
    @GetMapping("/current")
    WeatherDTO getCurrentWeather(@RequestParam(value = "access_key")String accessKey,
                                 @RequestParam(value="query") String city);
}

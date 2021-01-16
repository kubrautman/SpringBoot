package com.kubrautman.SpringBootSample.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kubrautman.SpringBootSample.Entities.*;
import com.kubrautman.SpringBootSample.Service.CityService;

@RestController
@RequestMapping("/city")
public class CityController {

	@Autowired
	private CityService cityService;
	
	@GetMapping("/all")
	private List<City> getCityAll(){
		return cityService.getAllCities();
	}
}

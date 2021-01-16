package com.kubrautman.SpringBootSample.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kubrautman.SpringBootSample.Dao.CityDao;
import com.kubrautman.SpringBootSample.Entities.City;
import com.kubrautman.SpringBootSample.Service.CityService;
@Service
public class CityServiceImpl implements CityService {

	@Autowired
	CityDao cityDao;
	
	@Override
	public List<City> getAllCities() {
		return cityDao.getAllCity();
	}

}

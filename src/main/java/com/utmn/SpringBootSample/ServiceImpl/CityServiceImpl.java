package com.utmn.SpringBootSample.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utmn.SpringBootSample.Dao.CityDao;
import com.utmn.SpringBootSample.Entities.City;
import com.utmn.SpringBootSample.Service.CityService;
@Service
public class CityServiceImpl implements CityService {

	@Autowired
	CityDao cityDao;
	
	@Override
	public List<City> getAllCities() {
		return cityDao.getAllCity();
	}

}

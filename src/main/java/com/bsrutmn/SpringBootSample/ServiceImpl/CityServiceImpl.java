package com.bsrutmn.SpringBootSample.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsrutmn.SpringBootSample.Dao.CityDao;
import com.bsrutmn.SpringBootSample.Entities.City;
import com.bsrutmn.SpringBootSample.Service.CityService;
@Service
public class CityServiceImpl implements CityService {

	@Autowired
	CityDao cityDao;
	
	@Override
	public List<City> getAllCities() {
		return cityDao.getAllCity();
	}

}

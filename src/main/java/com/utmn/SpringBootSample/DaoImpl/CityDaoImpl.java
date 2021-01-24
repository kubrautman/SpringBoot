package com.utmn.SpringBootSample.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.utmn.SpringBootSample.Dao.CityDao;
import com.utmn.SpringBootSample.Entities.*;

@Repository
public class CityDaoImpl implements CityDao {

	private EntityManager entityManager;

	public CityDaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	// AOP
	@Override
	@Transactional
	public List<City> getAllCity() {
		Session session = entityManager.unwrap(Session.class);
		List<City> cities = session.createQuery("from City", City.class).getResultList();
		return cities;
	}

}

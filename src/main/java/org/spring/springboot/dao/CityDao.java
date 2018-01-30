package org.spring.springboot.dao;

import java.util.List;

import org.spring.springboot.domain.City;

public interface CityDao {
	List<City> findByName();
	
	void add(City city);
}

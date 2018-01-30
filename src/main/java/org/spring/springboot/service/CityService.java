package org.spring.springboot.service;

import java.util.List;

import org.spring.springboot.domain.City;

public interface CityService {
	List<City> findByName();
	void add(City city);
}

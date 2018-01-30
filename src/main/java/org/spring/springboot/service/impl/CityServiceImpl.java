package org.spring.springboot.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.spring.springboot.dao.CityDao;
import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;

@Service(version = "1.0.0")
@org.springframework.stereotype.Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;
    public List<City> findByName() {
        return cityDao.findByName();
    }
	@Override
	public void add(City city) {
		cityDao.add(city);
	}

}

package org.spring.springboot.control;

import java.util.List;

import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoControl {
	 @Autowired
	 private CityService cityService;
	 
	 @RequestMapping("/find")
	 public String findOneCity(ModelMap model) {
    	 List<City> list= cityService.findByName();
    	 System.out.println(list.toString());
    	 return null;
	  }
}

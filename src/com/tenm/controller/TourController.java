package com.tenm.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tenm.service.TourService;

@Controller
public class TourController {
	
	@Autowired
	@Qualifier("tourServiceImpl")
	private TourService tourService;

	public TourController() {
		System.out.println("========== TourController Constructor ==========");
	}
	
	//	http://192.168.200.39:8080/app/json/gyungbokgung
	@RequestMapping(value="/json/{areaName}", method=RequestMethod.GET)
	public ModelAndView jsonLocationList
				(@PathVariable String areaName) throws Exception{
		
		System.out.println("request............");

		//Map location = tourService.getLocationMapJSON(areaName);
		
		List location = tourService.getLocationListJSON(areaName);
		
		//return new ModelAndView("locationJsonView", areaName, location.get("locationList"));
		
		return new ModelAndView("locationJsonView", areaName, location);
	}
	
}

package com.tenm.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.tenm.domain.Beacon;
import com.tenm.domain.LocationInfo;
import com.tenm.service.TourDao;
import com.tenm.service.TourService;

@Service
public class TourServiceImpl implements TourService {
	
	@Autowired
	@Qualifier("tourDaoImpl")
	private TourDao tourDao;

	@Value("#{dataProperties}") Map dataProperties;

	public TourServiceImpl() {
		System.out.println("========== TourServiceImpl Constructor ==========");
	}

	public List getLocationListJSON(String areaName) {	//��üLocationInfo�� List�� ����
		List list = tourDao.getLocationListJSON("");
		for (int i = 0; i < list.size(); i++) {
			LocationInfo locationInfo = (LocationInfo)tourDao.getLocationListJSON("").get(i);
			//locationInfo.setLocationDetail((String)propertiesMap.get(locationInfo.getLocationName()));
			locationInfo.setLocationDetail(getProperties(locationInfo));
			list.set(i, locationInfo);
		}
		return list;
	}

	public LocationInfo getLocationJSON(String locationName) {	//locationName�� LocationInfo�� ����
		LocationInfo locationInfo = tourDao.getLocationListJSON2("").get(locationName);
		locationInfo.setLocationDetail(getProperties(locationInfo));
		return locationInfo;
	}

	public Map getLocationMapJSON(String areaName) {	//��üLocationInfo�� Map���� ����
		Map<String, Object> locationMap = new HashMap<String, Object>();
		locationMap.put("locationInfo", tourDao.getLocationListJSON2(""));
		locationMap.put("locationDetail", dataProperties);
		return locationMap;
	}
	
	private String getProperties(LocationInfo locationInfo){
		return (String)dataProperties.get(locationInfo.getLocationName());
	}

	public Beacon getBeaconRegion(Beacon beacon) {
		
		return tourDao.getBeaconRegion(beacon);
	}
	
}

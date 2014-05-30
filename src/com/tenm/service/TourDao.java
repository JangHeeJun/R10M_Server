package com.tenm.service;

import java.util.List;
import java.util.Map;

import com.tenm.domain.Beacon;
import com.tenm.domain.LocationInfo;

public interface TourDao {
	
	public List getLocationListJSON(String locationName);
	
	public Map<String, LocationInfo> getLocationListJSON2(String locationName);
	
	public Beacon getBeaconRegion (Beacon beacon);
	
}

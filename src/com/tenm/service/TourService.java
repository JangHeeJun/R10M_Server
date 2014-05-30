package com.tenm.service;

import java.util.List;
import java.util.Map;

import com.tenm.domain.Beacon;
import com.tenm.domain.LocationInfo;

public interface TourService {
	
	public LocationInfo getLocationJSON(String locationName);
	
	public List getLocationListJSON(String locationName);

	public Map getLocationMapJSON(String locationName);
	
	public Beacon getBeaconRegion(Beacon beacon);

}

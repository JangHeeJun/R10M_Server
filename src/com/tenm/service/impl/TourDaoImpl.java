package com.tenm.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.tenm.domain.Beacon;
import com.tenm.domain.LocationInfo;
import com.tenm.service.TourDao;

@Repository("tourDaoImpl")
public class TourDaoImpl implements TourDao {

	///Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
		
	@Value("#{dataProperties}") Map propertiesMap;
	
	public void setSqlSession(SqlSession sqlSession){
		this.sqlSession = sqlSession;
	}
	
	///Constructor
	public TourDaoImpl() {
		System.out.println("========== TourDaoImpl Constructor ==========");
	}

	public List getLocationListJSON(String areaName) {	
		return sqlSession.selectList("Mapper.getLocationInfo", areaName);
	}

	public Map<String, LocationInfo> getLocationListJSON2(String areaName) {
		Map<String, LocationInfo> locationMap = new HashMap<String, LocationInfo>();
		locationMap = sqlSession.selectMap("Mapper.getLocationInfo", "locationName");
		return locationMap;
	}

	public Beacon getBeaconRegion(Beacon beacon) {
		return sqlSession.selectOne("Mapper.getRegionInfo", beacon);
	}
	
}

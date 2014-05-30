package com.tenm.domain;

public class Data {
	
	private int dataNo;
	private String dataPath;
	private int dataType;
	private int localNo;
	private int regionNo;
	
	public int getDataNo() {
		return dataNo;
	}
	public void setDataNo(int dataNo) {
		this.dataNo = dataNo;
	}
	public String getDataPath() {
		return dataPath;
	}
	public void setDataPath(String dataFileAdd) {
		this.dataPath = dataFileAdd;
	}
	public int getDataType() {
		return dataType;
	}
	public void setDataType(int dataType) {
		this.dataType = dataType;
	}
	public int getLocalNo() {
		return localNo;
	}
	public void setLocalNo(int localNo) {
		this.localNo = localNo;
	}
	public int getRegionNo() {
		return regionNo;
	}
	public void setRegionNo(int regoinNo) {
		this.regionNo = regoinNo;
	}
	
	@Override
	public String toString() {
		return "Data [dataNo =" + dataNo + ", dataFileAdd=" + dataPath + ", dataType=" + dataType 
				+ ", localNo=" + localNo + ", regionNo=" + regionNo + "]";
	}
	
	
}

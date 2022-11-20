package com.project.projectWithoutDB.module;

import java.util.List;

import org.springframework.stereotype.Component;

public class BuildingBlock {

	String buidingName;
	int capacity;
	List<Floor<Integer,List<Integer>>> floors;
	int parkingCapacity;
	public BuildingBlock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BuildingBlock(String buidingName, int capacity, List<Floor<Integer, List<Integer>>> floors,
			int parkingCapacity) {
		super();
		this.buidingName = buidingName;
		this.capacity = capacity;
		this.floors = floors;
		this.parkingCapacity = parkingCapacity;
	}
	public String getBuidingName() {
		return buidingName;
	}
	public void setBuidingName(String buidingName) {
		this.buidingName = buidingName;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public List<Floor<Integer, List<Integer>>> getFloors() {
		return floors;
	}
	public void setFloors(List<Floor<Integer, List<Integer>>> floors) {
		this.floors = floors;
	}
	public int getParkingCapacity() {
		return parkingCapacity;
	}
	public void setParkingCapacity(int parkingCapacity) {
		this.parkingCapacity = parkingCapacity;
	}
	@Override
	public String toString() {
		return "BuildingBlock [buidingName=" + buidingName + ", capacity=" + capacity + ", floors=" + floors
				+ ", parkingCapacity=" + parkingCapacity + "]";
	}
	
	
	
}

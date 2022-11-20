package com.project.projectWithoutDB.module;

import java.util.Collections;

public class Floor<FloorNo,FlatNo> {

	FloorNo floorNo;
	FlatNo flatNo;

	public Floor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Floor(FloorNo floorNo, FlatNo flatNo) {
		super();
		this.floorNo = floorNo;
		this.flatNo = flatNo;
	}

	public FloorNo getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(FloorNo floorNo) {
		this.floorNo = floorNo;
	}

	public FlatNo getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(FlatNo flatNo) {
		this.flatNo = flatNo;
	}

	@Override
	public String toString() {
		return "Floor [" + floorNo + " = " + flatNo + "]";
	}

}

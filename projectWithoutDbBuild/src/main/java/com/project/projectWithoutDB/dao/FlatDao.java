package com.project.projectWithoutDB.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.projectWithoutDB.module.BuildingBlock;
import com.project.projectWithoutDB.module.Floor;

@Repository
public class FlatDao {
	
	BuildingBlock block;
	
	public FlatDao(){
		List<Floor<Integer,List<Integer>>> floors = new ArrayList<Floor<Integer,List<Integer>>>();
		floors.add(new Floor<Integer, List<Integer>>(1, Arrays.asList(102,103,104,105)));
		floors.add(new Floor<Integer, List<Integer>>(2, Arrays.asList(202,203,204,205)));
		floors.add(new Floor<Integer, List<Integer>>(3, Arrays.asList(302,303,304,305)));
		floors.add(new Floor<Integer, List<Integer>>(4, Arrays.asList(402,403,404,405)));
		
		block = new BuildingBlock("Xyz", 250, floors, 2);
	}
	
	public BuildingBlock getData() {
		return block;
	}

}

package com.project.projectWithoutDB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.projectWithoutDB.dao.FlatDao;
import com.project.projectWithoutDB.module.BuildingBlock;

@RestController
public class FlatController {
	
	@Autowired
	FlatDao dao;
	
	@GetMapping("/getAllFlat")
	public BuildingBlock getAllFlat() {
		return dao.getData();
	}

}

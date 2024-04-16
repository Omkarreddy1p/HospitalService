package com.hospital.client.HospitalServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.client.HospitalServices.model.HospitalList;
import com.hospital.client.HospitalServices.request.HospitalData;
import com.hospital.client.HospitalServices.service.HospitalService;

@RestController
@RequestMapping("/hospitaldata")
public class HospitalController {
	
	@Autowired
	private HospitalService hospitalService;
	
	@PostMapping("/saveData")
	public String saveHospitalData(@RequestBody HospitalData HospitalData) throws Exception {
		
		return hospitalService.addHospitalData(HospitalData);
		
		
	}
	
	@GetMapping("/getAll")
	public List<HospitalList> getAllHospitals() {
		return hospitalService.getAllHospitals();
		
	}

}

package com.hospital.client.HospitalServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.client.HospitalServices.model.PhysicanList;
import com.hospital.client.HospitalServices.request.PhysicianData;
import com.hospital.client.HospitalServices.service.PhysicanService;

@RestController
@RequestMapping("/physician")
public class PhysicianController {

	@Autowired
	PhysicanService physService;
	
	@PostMapping("/addPhysician")
	public String addPhysicianInfo(@RequestBody PhysicianData phyData) {
		return physService.addPhysicianData(phyData);
		
	}
	
	@GetMapping("/getAllPhysicians")
	public List<PhysicanList> getAllPhysicians() {
		
		return physService.getPhysicians();
	}
}

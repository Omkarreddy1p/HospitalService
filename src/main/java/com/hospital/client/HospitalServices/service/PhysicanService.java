package com.hospital.client.HospitalServices.service;

import java.util.List;

import com.hospital.client.HospitalServices.model.PhysicanList;
import com.hospital.client.HospitalServices.request.PhysicianData;

public interface PhysicanService {

	public String addPhysicianData(PhysicianData data);
	
	public List<PhysicanList> getPhysicians();
}

package com.hospital.client.HospitalServices.service;

import java.util.List;

import com.hospital.client.HospitalServices.model.HospitalList;
import com.hospital.client.HospitalServices.request.HospitalData;

public interface HospitalService {

	public String addHospitalData(HospitalData data) throws Exception;
	
	public List<HospitalList> getAllHospitals();
}

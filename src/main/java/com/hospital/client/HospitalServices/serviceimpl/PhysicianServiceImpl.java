package com.hospital.client.HospitalServices.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.client.HospitalServices.model.PhysicanList;
import com.hospital.client.HospitalServices.repository.PhysicianRepository;
import com.hospital.client.HospitalServices.request.PhysicianData;
import com.hospital.client.HospitalServices.service.PhysicanService;

@Service
public class PhysicianServiceImpl implements PhysicanService{

	@Autowired
	private PhysicianRepository physRepository;
	@Override
	public String addPhysicianData(PhysicianData data) {
		PhysicanList phyData = new PhysicanList();
		phyData.setHospitalId(data.getHospitalId());
		phyData.setPhysicianAddress(data.getPhysicianAddress());
		phyData.setPhysicianBillingNumber(data.getPhysicianBillingNumber());
		phyData.setSpecialist(data.getSpecialist());
		phyData.setPhysicianNumber(data.getPhysicianNumber());
		phyData.setPhysicianName(data.getPhysicianName());
		
		physRepository.save(phyData);
		
		return "data saved successfully";
	}
	@Override
	public List<PhysicanList> getPhysicians() {
		
		return physRepository.findAll();
	}

}

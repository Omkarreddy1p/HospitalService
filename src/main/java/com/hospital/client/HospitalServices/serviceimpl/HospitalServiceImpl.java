package com.hospital.client.HospitalServices.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.client.HospitalServices.model.HospitalList;
import com.hospital.client.HospitalServices.repository.HospitalRepository;
import com.hospital.client.HospitalServices.request.HospitalData;
import com.hospital.client.HospitalServices.service.HospitalService;

@Service
public class HospitalServiceImpl implements HospitalService{
	
	
	  @Autowired 
	  private HospitalRepository hospitalrepository;
	 

	@Override
	public String addHospitalData(HospitalData data) throws Exception {
		
		HospitalList list = new HospitalList();
		list.setHospitalId(data.getHospitalId());
		list.setAddress(data.getAddress());
		list.setHospitalName(data.getHospitalName());
		list.setPhoneNumber(data.getPhoneNumber());
		if(list!=null) {
			hospitalrepository.save(list);
		}else 
			
			throw new Exception("Cannot save empty data");
		return "Sucess";
	}


	@Override
	public List<HospitalList> getAllHospitals() {
		
		List<HospitalList> list = hospitalrepository.findAll();
		
		return list;
	}
	
	
	

}

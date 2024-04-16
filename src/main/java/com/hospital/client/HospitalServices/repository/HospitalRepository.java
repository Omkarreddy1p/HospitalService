package com.hospital.client.HospitalServices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.hospital.client.HospitalServices.model.HospitalList;

@Repository
public interface HospitalRepository extends JpaRepository<HospitalList, Long > {
	
}

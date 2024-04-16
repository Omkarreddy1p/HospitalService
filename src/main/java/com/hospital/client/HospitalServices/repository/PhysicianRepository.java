package com.hospital.client.HospitalServices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.client.HospitalServices.model.PhysicanList;

@Repository
public interface PhysicianRepository extends JpaRepository<PhysicanList, Long>{

}

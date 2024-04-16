package com.hospital.client.HospitalServices.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="physicianlist")
public class PhysicanList {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable = false,unique = true, name ="id")
	private Long id;
	
	@Column(nullable = false,name="physician_number")
	private String physicianNumber;
	
	@Column(nullable = false,name ="physician_name")
	private String physicianName;
	
	@Column(nullable = false,name ="physician_billingNumber")
	private String physicianBillingNumber;
	
	@Column(nullable = false,name ="physician_address")
	private String physicianAddress;
	
	@Column(nullable = false,unique = true,name ="Hospital_id")
	private String HospitalId;

	@Column(nullable = false,name ="specialist")
	private String specialist;
	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhysicianNumber() {
		return physicianNumber;
	}

	public void setPhysicianNumber(String physicianNumber) {
		this.physicianNumber = physicianNumber;
	}

	public String getPhysicianName() {
		return physicianName;
	}

	public void setPhysicianName(String physicianName) {
		this.physicianName = physicianName;
	}

	public String getPhysicianBillingNumber() {
		return physicianBillingNumber;
	}

	public void setPhysicianBillingNumber(String physicianBillingNumber) {
		this.physicianBillingNumber = physicianBillingNumber;
	}

	public String getPhysicianAddress() {
		return physicianAddress;
	}

	public void setPhysicianAddress(String physicianAddress) {
		this.physicianAddress = physicianAddress;
	}

	public String getHospitalId() {
		return HospitalId;
	}

	public void setHospitalId(String hospitalId) {
		HospitalId = hospitalId;
	}
	
}

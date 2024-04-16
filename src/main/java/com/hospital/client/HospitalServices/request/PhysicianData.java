package com.hospital.client.HospitalServices.request;

public class PhysicianData {

	private Long id;
	
	private String physicianBillingNumber;
	private String physicianName;
	private String physicianAddress;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPhysicianBillingNumber() {
		return physicianBillingNumber;
	}
	public void setPhysicianBillingNumber(String physicianBillingNumber) {
		this.physicianBillingNumber = physicianBillingNumber;
	}
	public String getPhysicianName() {
		return physicianName;
	}
	public void setPhysicianName(String physicianName) {
		this.physicianName = physicianName;
	}
	public String getPhysicianAddress() {
		return physicianAddress;
	}
	public void setPhysicianAddress(String physicianAddress) {
		this.physicianAddress = physicianAddress;
	}
	public String getPhysicianNumber() {
		return physicianNumber;
	}
	public void setPhysicianNumber(String physicianNumber) {
		this.physicianNumber = physicianNumber;
	}
	public String getHospitalId() {
		return HospitalId;
	}
	public void setHospitalId(String hospitalId) {
		HospitalId = hospitalId;
	}
	private String physicianNumber;
	private String HospitalId;
	private String Specialist;
	public String getSpecialist() {
		return Specialist;
	}
	public void setSpecialist(String specialist) {
		Specialist = specialist;
	}
}

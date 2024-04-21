package com.shreenath.krishna.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class pilotentity {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String pilotName;
	    private String licenseNo;
	    private String ssn;
	    private String dob;
	    private String gender;
	    private String mobileNo;
	    private String email;
	    private String houseNo;
	    private String addressLine1;
	    private String city;
	    private String state;
	    private String country;
	    private String pinNo;
	    private String pilotId;
	    private String addressId;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getPilotName() {
			return pilotName;
		}
		public void setPilotName(String pilotName) {
			this.pilotName = pilotName;
		}
		public String getLicenseNo() {
			return licenseNo;
		}
		public void setLicenseNo(String licenseNo) {
			this.licenseNo = licenseNo;
		}
		public String getSsn() {
			return ssn;
		}
		public void setSsn(String ssn) {
			this.ssn = ssn;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getHouseNo() {
			return houseNo;
		}
		public void setHouseNo(String houseNo) {
			this.houseNo = houseNo;
		}
		public String getAddressLine1() {
			return addressLine1;
		}
		public void setAddressLine1(String addressLine1) {
			this.addressLine1 = addressLine1;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getPinNo() {
			return pinNo;
		}
		public void setPinNo(String pinNo) {
			this.pinNo = pinNo;
		}
		public String getPilotId() {
			return pilotId;
		}
		public void setPilotId(String pilotId) {
			this.pilotId = pilotId;
		}
		public String getAddressId() {
			return addressId;
		}
		public void setAddressId(String addressId) {
			this.addressId = addressId;
		}
		

	    // Getters and Setters
	    
	}



package com.shreenath.krishna.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
public class Hanger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Hanger location is required")
    @Pattern(regexp = "^[a-zA-Z ]+$", message = "Hanger location should contain only alphabets and spaces")
    private String hangerLocation;

    private int hangerCapacity;

    @NotBlank(message = "Manager name is required")
    private String managerName;

    @NotBlank(message = "Social Security No is required")
    @Pattern(regexp = "^\\d{9}$", message = "Social Security No should contain exactly 9 digits")
    private String socialSecurityNo;

    private Date dob;

    @NotBlank(message = "Gender is required")
    private String gender;

    @NotBlank(message = "Mobile No is required")
    @Pattern(regexp = "^\\d{10}$", message = "Mobile No should contain exactly 10 digits")
    private String mobileNo;

    @NotBlank(message = "Email Address is required")
    @Email(message = "Invalid email format")
    private String emailAddress;

    private String houseNo;

    @NotBlank(message = "Address Line1 is required")
    private String addressLine1;

    @NotBlank(message = "City is required")
    @Pattern(regexp = "^[a-zA-Z ]+$", message = "City should contain only alphabets and spaces")
    private String city;

    @NotBlank(message = "State is required")
    @Pattern(regexp = "^[a-zA-Z ]+$", message = "State should contain only alphabets and spaces")
    private String state;

    @NotBlank(message = "Country is required")
    @Pattern(regexp = "^[a-zA-Z ]+$", message = "Country should contain only alphabets and spaces")
    private String country;

    @NotBlank(message = "Pin No is required")
    @Pattern(regexp = "^\\d{7}$", message = "Pin No should contain exactly 7 digits")
    private String pinNo;

    private String hangerNo;
    private String addressId;
    private String managerId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHangerLocation() {
		return hangerLocation;
	}
	public void setHangerLocation(String hangerLocation) {
		this.hangerLocation = hangerLocation;
	}
	public int getHangerCapacity() {
		return hangerCapacity;
	}
	public void setHangerCapacity(int hangerCapacity) {
		this.hangerCapacity = hangerCapacity;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getSocialSecurityNo() {
		return socialSecurityNo;
	}
	public void setSocialSecurityNo(String socialSecurityNo) {
		this.socialSecurityNo = socialSecurityNo;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
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
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
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
	public String getHangerNo() {
		return hangerNo;
	}
	public void setHangerNo(String hangerNo) {
		this.hangerNo = hangerNo;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public Hanger(
			@NotBlank(message = "Hanger location is required") @Pattern(regexp = "^[a-zA-Z ]+$", message = "Hanger location should contain only alphabets and spaces") String hangerLocation,
			int hangerCapacity, @NotBlank(message = "Manager name is required") String managerName,
			@NotBlank(message = "Social Security No is required") @Pattern(regexp = "^\\d{9}$", message = "Social Security No should contain exactly 9 digits") String socialSecurityNo,
			Date dob, @NotBlank(message = "Gender is required") String gender,
			@NotBlank(message = "Mobile No is required") @Pattern(regexp = "^\\d{10}$", message = "Mobile No should contain exactly 10 digits") String mobileNo,
			@NotBlank(message = "Email Address is required") @Email(message = "Invalid email format") String emailAddress,
			String houseNo, @NotBlank(message = "Address Line1 is required") String addressLine1,
			@NotBlank(message = "City is required") @Pattern(regexp = "^[a-zA-Z ]+$", message = "City should contain only alphabets and spaces") String city,
			@NotBlank(message = "State is required") @Pattern(regexp = "^[a-zA-Z ]+$", message = "State should contain only alphabets and spaces") String state,
			@NotBlank(message = "Country is required") @Pattern(regexp = "^[a-zA-Z ]+$", message = "Country should contain only alphabets and spaces") String country,
			@NotBlank(message = "Pin No is required") @Pattern(regexp = "^\\d{7}$", message = "Pin No should contain exactly 7 digits") String pinNo,
			String hangerNo, String addressId, String managerId) {
		super();
		this.hangerLocation = hangerLocation;
		this.hangerCapacity = hangerCapacity;
		this.managerName = managerName;
		this.socialSecurityNo = socialSecurityNo;
		this.dob = dob;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.emailAddress = emailAddress;
		this.houseNo = houseNo;
		this.addressLine1 = addressLine1;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinNo = pinNo;
		this.hangerNo = hangerNo;
		this.addressId = addressId;
		this.managerId = managerId;
	}

    // Getters and setters
    // Constructors
    
}
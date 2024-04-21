package com.shreenath.krishna.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shreenath.krishna.model.pilotentity;

public interface PilotRepository extends JpaRepository<pilotentity, Long> {

	pilotentity findByEmail(String email);

	pilotentity findByMobileNo(String mobileNo);

	pilotentity findByLicenseNo(String licenseNo);

	pilotentity findBySsn(String ssn);

	pilotentity findByHouseNoAndCity(String houseNo, String city);

	pilotentity findByPilotId(String pilotId);

	pilotentity findByAddressId(String addressId);
}

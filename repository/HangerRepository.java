package com.shreenath.krishna.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shreenath.krishna.model.Hanger;

public interface HangerRepository extends JpaRepository<Hanger, Long> {

    boolean existsByEmailAddress(String emailAddress);

    boolean existsByMobileNo(String mobileNo);

    boolean existsByHouseNoAndCity(String houseNo, String city);

    boolean existsBySocialSecurityNo(String socialSecurityNo);
}

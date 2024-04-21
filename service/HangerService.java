package com.shreenath.krishna.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shreenath.krishna.Repository.HangerRepository;
import com.shreenath.krishna.model.Hanger;

@Service
public class HangerService {

    @Autowired
    private HangerRepository hangerRepository;

    public String addHanger(Hanger hanger) {
        // Validate email and mobileNo
        if (hangerRepository.existsByEmailAddress(hanger.getEmailAddress())) {
            throw new RuntimeException("Email address already exists");
        }

        if (hangerRepository.existsByMobileNo(hanger.getMobileNo())) {
            throw new RuntimeException("Mobile No already exists");
        }

        // Validate houseNo and city
        if (!hangerRepository.existsByHouseNoAndCity(hanger.getHouseNo(), hanger.getCity())) {
            throw new RuntimeException("House No and City not found");
        }

        // Validate Social Security No
        if (hangerRepository.existsBySocialSecurityNo(hanger.getSocialSecurityNo())) {
            throw new RuntimeException("Social Security No already exists");
        }

        // Generate Hanger No
        String hangerNo = hanger.getHangerLocation().substring(0, 3) + (101 + hangerRepository.count());

        // Generate Address ID
        String addressId = hanger.getCity().substring(0, 3) + (101 + hangerRepository.count());

        // Generate Manager ID
        String managerId = hanger.getSocialSecurityNo().substring(5) + (31 + hangerRepository.count());

        // Set generated IDs
        hanger.setHangerNo(hangerNo);
        hanger.setAddressId(addressId);
        hanger.setManagerId(managerId);

        // Save Hanger
        hangerRepository.save(hanger);

        return "{\"message\": \"Hanger added successfully\", \"hangerNo\": \"" + hanger.getHangerNo() + "\"}";
    }
}

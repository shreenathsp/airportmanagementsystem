package com.shreenath.krishna.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.shreenath.krishna.Repository.PlaneRepository;
import com.shreenath.krishna.exception.BusinessException;
import com.shreenath.krishna.generator.idGenerator;
import com.shreenath.krishna.model.PlaneEntity;

@Service
public class PlaneService {

    @Autowired
    private PlaneRepository planeRepository;

    public PlaneEntity addPlane(PlaneEntity planeEntity) {
 
        validatePlane(planeEntity);

 
        String planeId = idGenerator.generatePlaneId(planeEntity.getRegistrationNo());
        String addressId = idGenerator.generateAddressId(planeEntity.getCity());

        planeEntity.setId(null); 
        planeEntity.setEmail(planeEntity.getEmail().toLowerCase()); 
        planeEntity.setId(planeRepository.save(planeEntity).getId());

        return planeEntity;
    }

    private void validatePlane(PlaneEntity planeEntity) {
        if (!planeEntity.getEmail().matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            throw new BusinessException("Invalid email format", "INVALID_EMAIL");
        }

        if (planeRepository.findByEmail(planeEntity.getEmail()).isPresent()) {
            throw new BusinessException("Email already exists", "EMAIL_EXISTS");
        }

        if (planeRepository.findByHouseNoAndCity(planeEntity.getHouseNo(), planeEntity.getCity()).isPresent()) {
            throw new BusinessException("Address already exists", "ADDRESS_EXISTS");
        }

        
    }
}
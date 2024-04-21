package com.shreenath.krishna.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shreenath.krishna.model.PlaneEntity;

public interface PlaneRepository extends JpaRepository<PlaneEntity, Long> {
    Optional<PlaneEntity> findByEmail(String email);
    Optional<PlaneEntity> findByHouseNoAndCity(String houseNo, String city);
}

package com.shreenath.krishna.generator;

import org.springframework.stereotype.Component;

@Component
public class idGenerator {
    private static int planeIdCounter = 31;
    private static int addressIdCounter = 101;

    public static String generatePlaneId(String registrationNo) {
        return registrationNo.substring(registrationNo.length() - 4) + planeIdCounter++;
    }

    public static String generateAddressId(String city) {
        return city.substring(0, 3).toUpperCase() + addressIdCounter++;
    }
}
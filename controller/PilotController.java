package com.shreenath.krishna.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.shreenath.krishna.Repository.PilotRepository;
import com.shreenath.krishna.model.pilotentity;

@Controller
@RequestMapping("/api/pilots")
public class PilotController {

    @Autowired
    private PilotRepository pilotRepository;

    @GetMapping("/pilotdetails")
    public ModelAndView showAddPilotForm() {
        return new ModelAndView("addPilot");
    }

    @PostMapping("/add")
    public ResponseEntity<String> addPilot(@RequestBody pilotentity pilot) {
        // Validation and Business Logic Here
        // Generating IDs and Inserting Data to DB

        // For simplicity, I'm skipping the validation and business logic here.
        // You should implement the business rules and validation based on the requirements.

        pilot.setPilotId(generatePilotId(pilot.getSsn()));
        pilot.setAddressId(generateAddressId(pilot.getCity()));
        pilotRepository.save(pilot);

        return ResponseEntity.ok("Pilot added successfully " + pilot.getPilotId());
    }

    private String generatePilotId(String ssn) {
        return ssn.substring(ssn.length() - 4) + (pilotRepository.count() + 31);
    }

    private String generateAddressId(String city) {
        return city.substring(0, 3).toUpperCase() + (pilotRepository.count() + 101);
    }
}

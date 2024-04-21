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

import com.shreenath.krishna.Service.PlaneService;
import com.shreenath.krishna.model.PlaneEntity;

@Controller
@RequestMapping("/api/planes")
public class PlaneController {

    @Autowired
    private PlaneService planeService;
    @GetMapping("/planedetails")
    public ModelAndView showAddPilotForm() {
        return new ModelAndView("index");
    }

    @PostMapping("/add")
    public ResponseEntity<?> addPlane(@RequestBody PlaneEntity planeEntity) {
        PlaneEntity addedPlane = planeService.addPlane(planeEntity);
        return ResponseEntity.ok().body(addedPlane);
    }
}

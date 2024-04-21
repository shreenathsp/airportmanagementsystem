package com.shreenath.krishna.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.shreenath.krishna.Service.HangerService;
import com.shreenath.krishna.model.Hanger;

import jakarta.validation.Valid;

@Controller
public class HangerController {

    @Autowired
    private HangerService hangerService;

    @GetMapping("/hanger")
    public ModelAndView showHangerForm() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addHanger");  // Updated view name to "addHanger"
        return modelAndView;
    }

    @PostMapping("/api/hangers/add")
    public ModelAndView addHanger(@Valid Hanger hanger, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();

        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("addHanger");  // Updated view name to "addHanger"
            modelAndView.addObject("error", bindingResult.getAllErrors().get(0).getDefaultMessage());
            return modelAndView;
        }

        try {
            String response = hangerService.addHanger(hanger);
            modelAndView.setViewName("addHanger");  // Updated view name to "addHanger"
            modelAndView.addObject("message", "Hanger added successfully " + response);
        } catch (Exception e) {
            modelAndView.setViewName("addHanger");  // Updated view name to "addHanger"
            modelAndView.addObject("error", e.getMessage());
        }

        return modelAndView;
    }
} 
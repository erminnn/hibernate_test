package com.proba.proba12.controllers;

import com.proba.proba12.models.Country;
import com.proba.proba12.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {
    @Autowired
   CountryService countryService;



    @PostMapping(value = "/add")
    public void addCountry(@RequestBody Country country){
        countryService.addCountry(country);
    }
    @GetMapping(value = "/all")
    public List<Country> getCountries(){
        return countryService.getCountries();
    }
}

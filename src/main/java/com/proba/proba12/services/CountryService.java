package com.proba.proba12.services;

import com.proba.proba12.models.Country;
import com.proba.proba12.repositories.CountryRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CountryService {
    private  final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public void addCountry(Country country) {
        countryRepository.save(country);
    }
    public List<Country> getCountries(){
        return countryRepository.findAll();
    }
}

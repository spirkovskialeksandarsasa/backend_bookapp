package dev.sasespirkovski.labsemt181204.service.impl;

import dev.sasespirkovski.labsemt181204.model.Country;
import dev.sasespirkovski.labsemt181204.repository.CountryRepository;
import dev.sasespirkovski.labsemt181204.service.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> findAll() {
        return this.countryRepository.findAll();
    }
}


package dev.ehedei.exerciseob.services.impl;

import dev.ehedei.exerciseob.domain.Laptop;
import dev.ehedei.exerciseob.repositories.LaptopRepository;
import dev.ehedei.exerciseob.services.LaptopService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopServiceImpl implements LaptopService {

    private LaptopRepository laptopRepository;

    public LaptopServiceImpl(final LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @Override
    public List<Laptop> getAll() {
        return laptopRepository.findAll();
    }
}

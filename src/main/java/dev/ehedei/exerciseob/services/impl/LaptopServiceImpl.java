package dev.ehedei.exerciseob.services.impl;

import dev.ehedei.exerciseob.domain.Laptop;
import dev.ehedei.exerciseob.dtos.LaptopDto;
import dev.ehedei.exerciseob.repositories.LaptopRepository;
import dev.ehedei.exerciseob.services.LaptopService;
import org.springframework.beans.factory.annotation.Value;
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

    @Override
    public Laptop saveOne(final LaptopDto laptopDto) {
        final Laptop laptop = new Laptop();
        laptop.setModel(laptopDto.getModel());
        laptop.setManufacturer(laptopDto.getManufacturer());

        return laptopRepository.save(laptop);
    }
}

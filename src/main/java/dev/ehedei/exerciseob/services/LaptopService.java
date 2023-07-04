package dev.ehedei.exerciseob.services;

import dev.ehedei.exerciseob.domain.Laptop;
import dev.ehedei.exerciseob.dtos.LaptopDto;

import java.util.List;

public interface LaptopService {
    List<Laptop> getAll();

    Laptop saveOne(LaptopDto laptopDto);
}

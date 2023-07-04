package dev.ehedei.exerciseob.controllers;

import dev.ehedei.exerciseob.domain.Laptop;
import dev.ehedei.exerciseob.dtos.LaptopDto;
import dev.ehedei.exerciseob.services.LaptopService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class LaptopController {

    private final LaptopService laptopService;

    public LaptopController(final LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @GetMapping("/laptops")
    public List<Laptop> getAll() {
        return laptopService.getAll();
    }

    @PostMapping("/laptops")
    public Laptop getAll(@RequestBody() final LaptopDto laptopDto) {
        return laptopService.saveOne(laptopDto);
    }
}

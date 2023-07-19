package dev.ehedei.exerciseob.controllers;

import dev.ehedei.exerciseob.domain.Laptop;
import dev.ehedei.exerciseob.dtos.LaptopDto;
import dev.ehedei.exerciseob.services.LaptopService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Laptops", description = "Laptop management APIs")
@RestController
@RequestMapping("/api/v1")
public class LaptopController {

    private final LaptopService laptopService;

    public LaptopController(final LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @Operation(
            summary = "Retrieve a list of Laptops",
            description = "Get a list with all Laptop objects.")
    @GetMapping("/laptops")
    public List<Laptop> getAll() {
        return laptopService.getAll();
    }

    @Operation(
            summary = "Add a new Laptop",
            description = "Insert a new Laptop in system.")
    @PostMapping("/laptops")
    public Laptop getAll(@RequestBody final LaptopDto laptopDto) {
        return laptopService.saveOne(laptopDto);
    }
}

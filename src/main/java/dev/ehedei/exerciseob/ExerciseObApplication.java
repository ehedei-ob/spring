package dev.ehedei.exerciseob;

import dev.ehedei.exerciseob.domain.Laptop;
import dev.ehedei.exerciseob.repositories.LaptopRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@SpringBootApplication
public class ExerciseObApplication {

    private static final Random RANDOM = new Random();
    private static final int MIN_NUMBER_LAPTOPS = 5;
    private static final int MAX_NUMBER_LAPTOPS = 25;

    public static void main(String[] args) {

        final ConfigurableApplicationContext context = SpringApplication.run(ExerciseObApplication.class, args);
        final LaptopRepository laptopRepository = context.getBean(LaptopRepository.class);

        final int max = RANDOM.nextInt(MIN_NUMBER_LAPTOPS, MAX_NUMBER_LAPTOPS);

        final List<Laptop> laptops = IntStream.rangeClosed(MIN_NUMBER_LAPTOPS, max).mapToObj(num -> {
            final Laptop laptop = new Laptop();
            laptop.setManufacturer(String.format("Manufacturer %d", num));
            laptop.setModel(String.format("Model %d", num));
            return laptop;
        }).toList();

        laptopRepository.saveAll(laptops);
    }

}

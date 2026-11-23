package net.sahmi.demobdccspringdata;

import net.sahmi.demobdccspringdata.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoBdccSpringDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoBdccSpringDataApplication.class, args);
    }
    CommandLineRunner start(ProductRepository productRepository){
        return args -> {

        };
    }

}

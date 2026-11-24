package net.sahmi.demobdccspringdata.web;


import io.swagger.v3.oas.annotations.parameters.RequestBody;
import net.sahmi.demobdccspringdata.entities.Product;
import net.sahmi.demobdccspringdata.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductRestController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> allProducts() {
        return productRepository.findAll();
    }@GetMapping("/products/{id}")
    public Product findBuId(@PathVariable Long id){
        return productRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("Product not found"));
    }
    @GetMapping("/find/products")
    public List<Product> findProducts(@RequestParam String kw) {
        return productRepository.findByNameContains(kw);
    }
    @PostMapping("/products")
    public Product save(@RequestBody Product product){
        return productRepository.save(product);
    }
    @DeleteMapping("/products/{id}")
    public Product deleteProduct(@PathVariable Long id){
        productRepository.deleteById(id);
        return null;
    }


}
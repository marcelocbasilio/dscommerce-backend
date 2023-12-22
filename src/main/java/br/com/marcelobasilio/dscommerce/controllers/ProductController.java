package br.com.marcelobasilio.dscommerce.controllers;

import br.com.marcelobasilio.dscommerce.dto.ProductDTO;
import br.com.marcelobasilio.dscommerce.entities.Product;
import br.com.marcelobasilio.dscommerce.repositories.ProductRepository;
import br.com.marcelobasilio.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;
    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id) {
        return productService.findById(id);
    }
}

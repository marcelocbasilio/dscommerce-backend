package br.com.marcelobasilio.dscommerce.services;

import br.com.marcelobasilio.dscommerce.dto.ProductDTO;
import br.com.marcelobasilio.dscommerce.entities.Product;
import br.com.marcelobasilio.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Optional<Product> result = productRepository.findById(id);
        Product product = result.orElseThrow();
        return new ProductDTO(product);
    }
}

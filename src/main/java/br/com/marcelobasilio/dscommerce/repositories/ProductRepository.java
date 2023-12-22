package br.com.marcelobasilio.dscommerce.repositories;

import br.com.marcelobasilio.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

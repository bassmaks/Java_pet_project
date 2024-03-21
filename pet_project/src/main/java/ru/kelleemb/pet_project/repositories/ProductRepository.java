package ru.kelleemb.pet_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kelleemb.pet_project.models.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitle(String title);
}

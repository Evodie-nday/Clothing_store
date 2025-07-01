package org.devkiki.ecommerce.e_commerce.category;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Optional<Category> findByNameIgnoreCase(String name);
    List<Category> findByNameContainingIgnoreCase(String name);
    boolean existsByNameIgnoreCase(String name);

}

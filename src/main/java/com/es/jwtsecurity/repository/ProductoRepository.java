package com.es.jwtsecurity.repository;

import com.es.jwtsecurity.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}

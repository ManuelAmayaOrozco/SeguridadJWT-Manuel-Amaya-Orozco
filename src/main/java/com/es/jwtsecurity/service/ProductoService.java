package com.es.jwtsecurity.service;

import com.es.jwtsecurity.dto.ProductoDTO;
import com.es.jwtsecurity.model.Producto;
import com.es.jwtsecurity.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public ProductoDTO create(ProductoDTO productoDTO) {

        Producto producto = mapToProducto(productoDTO);

        producto = productoRepository.save(producto);

        return mapToDTO(producto);

    }

    private ProductoDTO mapToDTO(Producto producto) {

        ProductoDTO productoDTO = new ProductoDTO();
        productoDTO.setNombre(producto.getNombre());
        productoDTO.setStock(producto.getStock());
        productoDTO.setPrecio(producto.getPrecio());
        return productoDTO;

    }

    private Producto mapToProducto(ProductoDTO productoDTO) {

        Producto producto = new Producto();
        producto.setNombre(productoDTO.getNombre());
        producto.setStock(productoDTO.getStock());
        producto.setPrecio(productoDTO.getPrecio());
        return producto;

    }

}

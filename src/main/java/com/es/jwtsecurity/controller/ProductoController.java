package com.es.jwtsecurity.controller;

import com.es.jwtsecurity.dto.ProductoDTO;
import com.es.jwtsecurity.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping
    public ResponseEntity<ProductoDTO> create(
            @RequestBody ProductoDTO productoDTO
    ) {

        ProductoDTO p = productoService.create(productoDTO);


        ResponseEntity<ProductoDTO> respuesta = new ResponseEntity<ProductoDTO>(
                p, HttpStatus.CREATED
        );
        return respuesta;

    }

}

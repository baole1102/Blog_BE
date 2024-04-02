package com.example.sprint2.service;

import com.example.sprint2.dto.IProductDto;
import com.example.sprint2.dto.ProductDto;
import com.example.sprint2.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProductService {
    Page<Product> listProduct(Pageable pageable);
    Product getProductById(Long id);
    List<Product> listRelated();
    Page<IProductDto> historyProduct (Pageable pageable, Long idUser);
    Page<Product> manageProduct(Pageable pageable, String name);
    void save(Product product);

}

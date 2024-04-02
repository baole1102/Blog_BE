package com.example.sprint2.service;

import com.example.sprint2.dto.IProductDto;
import com.example.sprint2.dto.ProductDto;
import com.example.sprint2.model.Product;
import com.example.sprint2.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public Page<Product> listProduct(Pageable pageable) {
        return productRepository.listProduct(pageable);
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.getProductById(id);
    }

    @Override
    public List<Product> listRelated() {
        return productRepository.listRelated();
    }

    @Override
    public Page<IProductDto> historyProduct(Pageable pageable, Long idUser) {
        return productRepository.historyProduct(pageable, idUser);
    }

    @Override
    public Page<Product> manageProduct(Pageable pageable, String name) {
        return productRepository.manageProduct(pageable, "%" + name + "%");
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

}

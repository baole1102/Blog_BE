package com.example.sprint2.repository;

import com.example.sprint2.dto.BlogDTO;
import com.example.sprint2.dto.IProductDto;
import com.example.sprint2.dto.ProductDto;
import com.example.sprint2.model.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "select * from product p where p.is_deleted = false ", nativeQuery = true)
    Page<Product> listProduct(Pageable pageable);

    Product getProductById(Long id);

    @Query(value = "select * from product p\n" +
            "where p.is_deleted = false\n" +
            "order by p.content desc\n" +
            "limit 4", nativeQuery = true)
    List<Product> listRelated();

    @Query(value = "select c.quantity as cartQuantity,\n" +
            "p.name_product as nameProduct,p.price as priceProduct,\n" +
            "p.image_product as imageProduct\n" +
            "from cart c\n" +
            "join product p on c.product_id = p.id\n" +
            "where c.user_id = :idUser and c.status = 1", nativeQuery = true)
    Page<IProductDto> historyProduct (Pageable pageable,Long idUser);

    @Query(value = "select * from product p where p.is_deleted = false and p.content like :name", nativeQuery = true)
    Page<Product> manageProduct(Pageable pageable, String name);

}

package com.example.sprint2.service;

import com.example.sprint2.dto.ICartDto;
import com.example.sprint2.dto.IProductDto;
import com.example.sprint2.model.Cart;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface ICartService {

    void addToCart(Long idProduct,Long idUser);
    List<Cart> findByProduct(Long idProduct,Long idUser);
    Cart getCartByIdProductAndIdUser(Long idProduct,Long idUser);
    void save(Cart cart);
    List<ICartDto> listCart(Long idUser);
    Long totalPrice(Long idUser);
    void paymentCart(Long idUser, LocalDateTime date);
    Long countCart(Long idUser);
    void deleteCart(Long idProduct,Long idUser);
    Page<ICartDto> historyProduct (Pageable pageable, Long idUser);
}

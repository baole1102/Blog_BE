package com.example.sprint2.service;

import com.example.sprint2.dto.ICartDto;
import com.example.sprint2.model.Cart;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICartService {

    void addToCart(Long idProduct,Long idUser);
    List<Cart> findByProduct(Long idProduct,Long idUser);
    Cart getCartByIdProductAndIdUser(Long idProduct,Long idUser);
    void save(Cart cart);
    List<ICartDto> listCart(Long idUser);
    Long totalPrice(Long idUser);
    void paymentCart(@Param("idUser") Long idUser);
    Long countCart(@Param("idUser") Long idUser);
    void deleteCart(Long idProduct,Long idUser);

}

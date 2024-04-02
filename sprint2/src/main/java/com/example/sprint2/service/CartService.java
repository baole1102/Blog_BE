package com.example.sprint2.service;

import com.example.sprint2.dto.ICartDto;
import com.example.sprint2.model.Cart;
import com.example.sprint2.repository.ICartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService implements ICartService{
    @Autowired
    private ICartRepository cartRepository;
    @Override
    public void addToCart(Long idProduct, Long idUser) {
        cartRepository.addToCart(idProduct,idUser);
    }

    @Override
    public List<Cart> findByProduct(Long idProduct,Long idUser) {
        return cartRepository.findByProduct(idProduct,idUser);
    }

    @Override
    public Cart getCartByIdProductAndIdUser(Long idProduct, Long idUser) {
        return cartRepository.getCartByIdProductAndIdUser(idProduct,idUser);
    }

    @Override
    public void save(Cart cart) {
        cartRepository.save(cart);
    }

    @Override
    public List<ICartDto> listCart(Long idUser) {
        return cartRepository.listCart(idUser);
    }

    @Override
    public Long totalPrice(Long idUser) {
        return cartRepository.totalPrice(idUser);
    }

    @Override
    public void paymentCart(Long idUser) {
        cartRepository.paymentCart(idUser);
    }

    @Override
    public Long countCart(Long idUser) {
        return cartRepository.countCart(idUser);
    }

    @Override
    public void deleteCart(Long idProduct, Long idUser) {
        cartRepository.deleteCart(idProduct,idUser);
    }
}
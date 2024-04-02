package com.example.sprint2.service;

import com.example.sprint2.dto.IUserDto;
import com.example.sprint2.model.User;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface IUserService {
    User findUserByEmail(String email);
    User findUserByNumber(String number);
    void registerUser(User user, Long role);
    User findUserById( Long idUser);
    String login(String nameAccount,String passWord) throws Exception;
    Optional<User> findByAccount(String account);
    void updateForUser(@Param("id") Long id);
    User findUserByAccount(@Param("account") String account);
    String getRoleForUser(String account);

}

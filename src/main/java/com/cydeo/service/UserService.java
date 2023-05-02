package com.cydeo.service;

import com.cydeo.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> listAllUsers();
    // it is not a sql query, since it is a method called by controller we can give any name
    UserDTO findByUserName(String userName);
    void save(UserDTO dto);
    UserDTO update(UserDTO dto);
    void deleteByUserName(String userName);
}

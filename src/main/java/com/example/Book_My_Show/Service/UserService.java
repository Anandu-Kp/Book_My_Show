package com.example.Book_My_Show.Service;

import com.example.Book_My_Show.Entities.User;
import com.example.Book_My_Show.EntryDtos.UserEntryDto;
import com.example.Book_My_Show.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public void addUser(UserEntryDto userEntryDto)
    {
        //here we need to convert userDTO into user object
        //old way is setting each attribute

        User user= User.builder().age(userEntryDto.getAge()).name(userEntryDto.getName()).email(userEntryDto.getEmail()).mobNo(userEntryDto.getMobNo()).address(userEntryDto.getAddress()).build();

        userRepository.save(user);
    }
}

package com.example.BookMyShowProject.ServiceLayer;

import com.example.BookMyShowProject.Models.User;
import com.example.BookMyShowProject.RequestDtos.AddUserRequest;
import com.example.BookMyShowProject.Transformers.UserTransformers;
import com.example.BookMyShowProject.RepositoryLayer.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public String addUser(AddUserRequest addUserRequest){

//        User user = new User();
//
//        user.setAge(addUserRequest.getAge());
//        user.setEmailId(addUserRequest.getEmailId());
//        user.setMobNo(addUserRequest.getMobNo());
//        user.setName(addUserRequest.getName());


//        User userObj = User.builder().age(addUserRequest.getAge()).emailId(addUserRequest.getEmailId()).mobNo(addUserRequest.getMobNo()).name(addUserRequest.getName()).build();
//        userRepository.save(userObj);



        User userObj = UserTransformers.convertAddUserReqToUserEntity(addUserRequest);
        userRepository.save(userObj);

        Collections.sort(new ArrayList<Integer>());

        return  "User added successfully";




    }
}

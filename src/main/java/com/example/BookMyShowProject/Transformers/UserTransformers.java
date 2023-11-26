package com.example.BookMyShowProject.Transformers;

import com.example.BookMyShowProject.Models.User;
import com.example.BookMyShowProject.RequestDtos.AddUserRequest;

public class UserTransformers {


    public static User convertAddUserReqToUserEntity(AddUserRequest addUserRequest){


        User userObj = User.builder()
                .age(addUserRequest.getAge())
                .emailId(addUserRequest.getEmailId())
                .mobNo(addUserRequest.getMobNo())
                .name(addUserRequest.getName())
                .build();


        return userObj;

    }

}

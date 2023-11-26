package com.example.BookMyShowProject.Transformers;

import com.example.BookMyShowProject.Models.Show;
import com.example.BookMyShowProject.RequestDtos.AddShowRequest;

public class ShowTransformers {
    public static Show convertAddRequestToEntity(AddShowRequest addShowRequest){

        Show showObj = Show.builder().showDate(addShowRequest.getShowDate())
                .showTime(addShowRequest.getShowTime())
                .build();

        return showObj;
    }
}


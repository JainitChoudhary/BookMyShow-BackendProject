package com.example.BookMyShowProject.RequestDtos;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
public class AddShowRequest {

    private LocalDate showDate;
    private LocalTime showTime;
    private String movieName; //Movie name is unique : movie Entity is unqiue
    private Integer theaterId;
}

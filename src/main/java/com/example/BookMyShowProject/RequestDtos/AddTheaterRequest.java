package com.example.BookMyShowProject.RequestDtos;

import com.example.BookMyShowProject.Enums.City;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddTheaterRequest {

    private String name;

    private String address;

    private City city;

    private Integer noOFClassicSeats;

    private Integer noOfPremiumSeats;

    private Integer noOfSeatsPerRow;



}

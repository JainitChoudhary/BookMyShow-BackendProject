package com.example.BookMyShowProject.ServiceLayer;

import com.example.BookMyShowProject.Enums.SeatType;
import com.example.BookMyShowProject.Models.Theater;
import com.example.BookMyShowProject.Models.TheaterSeat;
import com.example.BookMyShowProject.RepositoryLayer.TheaterRepository;
import com.example.BookMyShowProject.RequestDtos.AddTheaterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TheaterService {

    @Autowired
    private TheaterRepository theaterRepository;


    public String addTheater(AddTheaterRequest addTheaterRequest){

        //1. Create the Theater Entity
        Theater theater = Theater.builder().name(addTheaterRequest.getName())
                .address(addTheaterRequest.getAddress())
                .city(addTheaterRequest.getCity())
                .build();

        //Create the theater Seats Entity
        createTheaterSeats(theater,addTheaterRequest);

        return "Theater and its seats have been saved to DB";
    }

    public void createTheaterSeats(Theater theater,AddTheaterRequest addTheaterRequest){


        int noOfClassicSeats = addTheaterRequest.getNoOFClassicSeats();
        int noOfPremiumSeats = addTheaterRequest.getNoOfPremiumSeats();
        int seatsPerRow = addTheaterRequest.getNoOfSeatsPerRow();

        //Create the Primary Seat Entities
        List<TheaterSeat> theaterSeatList = new ArrayList<>();

        int row = 0;
        char ch = 'A';
        for(int i=1;i<=noOfClassicSeats;i++) {

            if(i%seatsPerRow==1) {
                row++;
                ch = 'A';
            }
            String seatNo = row+""+ch;
            ch++;

            TheaterSeat theaterSeat = TheaterSeat.builder()
                    .seatNo(seatNo)
                    .seatType(SeatType.CLASSIC)
                    .theater(theater) //Setting the FK also
                    .build();

            theaterSeatList.add(theaterSeat);
        }


        //Similar numbering I will do for the Premium Seats :
        ch = 'A';
        for(int i=1;i<=noOfPremiumSeats;i++){

            if(i%seatsPerRow==1) {
                row++;
                ch = 'A';
            }
            String seatNo = row+""+ch;
            ch = (char)(ch+1);

            TheaterSeat theaterSeat = TheaterSeat.builder()
                    .seatNo(seatNo)
                    .seatType(SeatType.PREMIUM)
                    .theater(theater) //Setting the FK also
                    .build();

            theaterSeatList.add(theaterSeat);
        }

        //This is done for bidirectional mapping
        theater.setTheaterSeatList(theaterSeatList);
        theaterRepository.save(theater);
    }

}
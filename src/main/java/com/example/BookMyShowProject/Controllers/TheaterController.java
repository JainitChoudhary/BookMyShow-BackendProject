package com.example.BookMyShowProject.Controllers;

import com.example.BookMyShowProject.RequestDtos.AddTheaterRequest;
import com.example.BookMyShowProject.ServiceLayer.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theater")
public class TheaterController {

    @Autowired
    private TheaterService theaterService;

    @PostMapping("/addTheater")
    public ResponseEntity addTheater(@RequestBody AddTheaterRequest addTheaterRequest){

        String response= theaterService.addTheater(addTheaterRequest);

        return  new ResponseEntity(response, HttpStatus.OK);

    }
}

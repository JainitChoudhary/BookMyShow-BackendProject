package com.example.BookMyShowProject.Controllers;

import com.example.BookMyShowProject.RequestDtos.AddShowRequest;
import com.example.BookMyShowProject.RequestDtos.AddShowSeatsRequest;
import com.example.BookMyShowProject.ServiceLayer.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("show")
public class ShowController {

    @Autowired
    private ShowService showService;

    @PostMapping("/addShow")
    public String addShow(@RequestBody AddShowRequest addShowRequest){

        String result = showService.addShow(addShowRequest);
        return result;
    }

    @PostMapping("/createShowSeats")
    public String enableShowSeats(@RequestBody AddShowSeatsRequest addShowSeatsRequest) {

        String result = showService.createShowSeats(addShowSeatsRequest);
        return result;
    }




}
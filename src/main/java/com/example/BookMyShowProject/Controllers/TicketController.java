package com.example.BookMyShowProject.Controllers;

import com.example.BookMyShowProject.RequestDtos.BookTicketRequest;
import com.example.BookMyShowProject.ServiceLayer.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/bookTicket")
    private String bookTicket(@RequestBody BookTicketRequest bookTicketRequest) {

        String result  = ticketService.bookTicket(bookTicketRequest);
        return result;
    }
}

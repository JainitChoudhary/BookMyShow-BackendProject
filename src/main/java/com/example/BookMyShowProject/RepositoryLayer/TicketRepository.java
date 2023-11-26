package com.example.BookMyShowProject.RepositoryLayer;

import com.example.BookMyShowProject.Models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
}

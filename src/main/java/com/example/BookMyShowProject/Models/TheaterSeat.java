package com.example.BookMyShowProject.Models;

import com.example.BookMyShowProject.Enums.SeatType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "theaterSeat")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TheaterSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer theaterSeatId;

    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    @ManyToOne
    @JoinColumn
    private Theater theater;

}

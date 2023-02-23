package com.example.Book_My_Show.Entities;

import com.example.Book_My_Show.Enum.SeatType;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "show_seat")
public class ShowSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private boolean isBooked;

    private int price; //price per seat

    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private Date bookedAt;

    @ManyToOne
    @JoinColumn
    Show show;
}

package com.example.Book_My_Show.Entities;

import com.example.Book_My_Show.Enum.ShowType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "show")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate showDate;

    private LocalTime showTime;

    @Enumerated(value = EnumType.STRING)
    private ShowType showType;

    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedOn;

    @ManyToOne
    @JoinColumn
    Theatre theatre;

    @ManyToOne
    @JoinColumn
    Movie movie;

    @OneToMany(mappedBy = "show",cascade = CascadeType.ALL)
    List<ShowSeat> showSeatList=new ArrayList<>();

   @OneToMany(mappedBy = "show",cascade = CascadeType.ALL)
    List<Ticket> ticketList=new ArrayList<>();
}
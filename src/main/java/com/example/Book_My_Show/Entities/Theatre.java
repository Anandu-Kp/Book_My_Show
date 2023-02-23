package com.example.Book_My_Show.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "theatre")
@NoArgsConstructor
@AllArgsConstructor

public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    private String name;

    private String location;

    @OneToMany(mappedBy = "theatre",cascade = CascadeType.ALL)
    List<TheatreSeat> theatreSeatList=new ArrayList<>();

    @OneToMany(mappedBy = "theatre",cascade = CascadeType.ALL)
    List<Show> showList=new ArrayList<>();
}

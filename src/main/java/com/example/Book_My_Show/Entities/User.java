package com.example.Book_My_Show.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;
    @Column(unique = true)
    private String email;
    @Column(unique = true,nullable = false)
    private String mobNo;
    private String address;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    List<Ticket> ticketList=new ArrayList<>();
}

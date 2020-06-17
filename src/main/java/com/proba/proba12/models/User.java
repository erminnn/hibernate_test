package com.proba.proba12.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @Column(name = "user_id")
    private Long id;

    private String name;
    private String username;
    private String password;

    @ManyToOne
    @JoinColumn(name = "country_id")
    Country country;

}

package com.proba.proba12.models;

import com.proba.proba12.core.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
@AttributeOverride(name = "id" ,column = @Column(name = "user_id"))
public class User extends BaseEntity {

    public User(){
        super();
    }

    private String name;
    private String username;
    private String password;

    @ManyToOne
    @JoinColumn(name = "country_id")
    Country country;

}

package com.proba.proba12.models;

import com.proba.proba12.core.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "country")
@AttributeOverride(name = "id" ,column = @Column(name = "country_id"))
public class Country extends BaseEntity {

    public Country(){
        super();
    }
    private String name;

}

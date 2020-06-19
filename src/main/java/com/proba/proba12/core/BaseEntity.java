package com.proba.proba12.core;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
        Long id;

        protected BaseEntity(){
            id = null;
        }
    }


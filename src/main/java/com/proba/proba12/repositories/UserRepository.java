package com.proba.proba12.repositories;

import com.proba.proba12.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    @Override
    @Query("SELECT u from User u INNER JOIN u.country")
    List<User> findAll();
}

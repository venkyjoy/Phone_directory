package com.example.phone_directory.repository;

import com.example.phone_directory.model.Phonemodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface Phonerepository extends JpaRepository <Phonemodel,Integer> {


    @Query("SELECT p FROM Phonemodel p WHERE p.Firstname LIKE %?1%"
            + " OR p.Lastname LIKE %?1%")
    public List<Phonemodel> search(String keyword);


}

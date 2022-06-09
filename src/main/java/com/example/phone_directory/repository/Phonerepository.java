package com.example.phone_directory.repository;

import com.example.phone_directory.model.Phonemodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Phonerepository extends JpaRepository <Phonemodel,Integer> {



}

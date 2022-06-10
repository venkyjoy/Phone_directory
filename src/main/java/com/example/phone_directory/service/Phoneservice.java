package com.example.phone_directory.service;

import com.example.phone_directory.model.Phonemodel;

import java.util.List;

public interface Phoneservice {


    List<Phonemodel> getAllPhone();

    List<Phonemodel> listAll(String keyword);
}


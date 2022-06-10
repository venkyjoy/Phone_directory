package com.example.phone_directory.controller;

import com.example.phone_directory.model.Phonemodel;

import com.example.phone_directory.service.Phoneserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;


@Controller
public class Phonecontroller {

    @Autowired
    private Phoneserviceimpl phoneservice;


    @GetMapping("/save")
    public  String  setDatainDB(){
        phoneservice.savePhoneData();
        return "save";
    }

    @GetMapping("/index")
    public String add(Model model){
        model.addAttribute("phonedirectory", phoneservice.getAllPhone());
        return "index";
    }

    @RequestMapping("/")
    public String viewHomePage(Model model, @Param("keyword") String keyword) {
        List<Phonemodel>  listPhonemodel = phoneservice.listAll(keyword);
        model.addAttribute("phonenumbers", listPhonemodel);
        model.addAttribute("keyword", keyword);

        return "result";
    }





}

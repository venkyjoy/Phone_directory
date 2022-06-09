package com.example.phone_directory.controller;

import com.example.phone_directory.model.Phonemodel;
import com.example.phone_directory.service.Phoneserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
public class Phonecontroller {

    @Autowired
    private Phoneserviceimpl phoneservice;


    @RequestMapping(path="feedPhoneData")
    public  void  setDatainDB(){
        phoneservice.savePhoneData();
    }

    @GetMapping("/index")
    public String add(Model model){
        List<Phonemodel> listphone = phoneservice.listALL();
        model.addAttribute("phonedirectory", phoneservice.listALL());
        return "index";
    }





}

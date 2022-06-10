package com.example.phone_directory.service;

import com.example.phone_directory.model.Phonemodel;
import com.example.phone_directory.repository.Phonerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


@Service
public class Phoneserviceimpl implements Phoneservice {
    @Autowired
    private Phonerepository phonerepository;


    String line = "";
    public void savePhoneData(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/templates/phone-dataset.csv"));
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                Phonemodel p = new Phonemodel();
                p.setId(Integer.parseInt(data[0]));
                p.setFirstname(data[1]);
                p.setLastname(data[2]);
                p.setState(data[3]);
                p.setPhone(data[4]);
                phonerepository.save(p);
            }
        } catch (IOException e){

            e.printStackTrace();
        }

    }


    @Override
    public  List<Phonemodel> getAllPhone() {
        return phonerepository.findAll();

    }

    @Override
    public List<Phonemodel> listAll(String keyword) {
        if (keyword != null) {
            return phonerepository.search(keyword);
        }
        return phonerepository.findAll();
    }



}

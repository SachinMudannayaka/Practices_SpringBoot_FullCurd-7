package com.allcurd.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allcurd.demo.DTO.Dto;
import com.allcurd.demo.Service.service;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v/user")
public class controller {
    @Autowired
    private service service;


    @PostMapping("/postUser")
    public Dto setUser(@RequestBody Dto dto){
        return service.setUser(dto);
    }

    @GetMapping("/getUser")
    public List<Dto> getUser(){
        return service.getUser();
    }
    @PutMapping("/putUser")
    public Dto putUser(@RequestBody Dto dto){
        return service.putUser(dto);
    }
    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody  Dto dto){
         return service.deleteUser(dto);
    }
}

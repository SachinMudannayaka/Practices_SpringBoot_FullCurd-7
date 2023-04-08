package com.allcurd.demo.Service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb.OrderDto;
import org.springframework.stereotype.Service;

import com.allcurd.demo.DTO.Dto;
import com.allcurd.demo.Entity.User;
import com.allcurd.demo.Repository.repo;

import jakarta.transaction.Transactional;
@Transactional
@Service
public class service {
    @Autowired
    private repo repo;
  @Autowired
  private ModelMapper modelMapper;
    

    public Dto setUser(Dto dto){
        repo.save(modelMapper.map(dto, User.class));
        return dto;
    }

    public Dto putUser(Dto dto){
       repo.save(modelMapper.map(dto,User.class));
       return dto;
    }

    public List<Dto> getUser(){
        List<User>allUsers=repo.findAll();
        return modelMapper.map(allUsers,new TypeToken<List<Dto>>(){}.getType());
    }

    public boolean deleteUser(Dto dto){
        repo.delete(modelMapper.map(dto, User.class));
        return true;
    }
}

package com.allcurd.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allcurd.demo.Entity.User;

public interface repo extends JpaRepository<User,Integer>{
    
}

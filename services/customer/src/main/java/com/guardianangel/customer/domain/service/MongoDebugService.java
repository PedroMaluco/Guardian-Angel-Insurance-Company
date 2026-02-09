package com.guardianangel.customer.domain.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class MongoDebugService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @PostConstruct
    public void printDBName(){
        System.out.println("Mongo DB in use: " + mongoTemplate.getDb().getName());
    }
}

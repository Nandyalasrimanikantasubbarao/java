package com.manikanta;

import com.manikanta.entity.Alien;
import com.manikanta.repo.IAlienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataJPARunner implements CommandLineRunner {

    @Autowired
    private IAlienRepo repo;

    @Override
    public  void run(String... args) throws Exception{
        System.out.println(repo.getClass().getName());
        repo.save(new Alien(2,"Ravi","Hyderabad"));
    }
}

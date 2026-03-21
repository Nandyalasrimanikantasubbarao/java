package com.manikanta.service;

import com.manikanta.entity.Vaccine;
import com.manikanta.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VaccineService implements  IVaccineService{

    private  IVaccineRepo repo;

    @Autowired
    public void setRepo(IVaccineRepo repo){

        this.repo=repo;
    }


    @Override
    public List<Vaccine> fetchByCost(Double cost) {
        return repo.findByCost(cost);
    }

    @Override
    public List<Vaccine> fetchByCostLessThanEqual(Double cost) {
        return repo.findByCostLessThanEqual(cost);
    }

    @Override
    public List<Vaccine> fetchByCostBetween(Double startCost, Double endCost) {
        return repo.findByCostBetween(startCost,endCost);
    }

    @Override
    public List<Vaccine> fetchByVaccineCompanyEquals(String companyName) {
        return repo.findByVaccineCompanyEquals(companyName);
    }
}

package com.manikanta.service;

import com.manikanta.entity.Vaccine;
import com.manikanta.repo.IVaccineRepo;
import com.manikanta.view.ResultView;
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
    public List<ResultView> fetchByCost(Double cost) {
        return repo.findByCostLessThan(cost);
    }
}

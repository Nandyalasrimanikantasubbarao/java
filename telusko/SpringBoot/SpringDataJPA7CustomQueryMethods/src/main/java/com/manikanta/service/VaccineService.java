package com.manikanta.service;

import com.manikanta.entity.Vaccine;
import com.manikanta.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    public List<Vaccine> fetchByVaccineCompany(String companyName) {
        return repo.searchByVaccineCompany(companyName);
    }

    @Override
    public List<Vaccine> fetchByVaccineCompany(String comp1, String comp2) {
        return repo.searchByVaccineCompany(comp1,comp2);
    }

    @Override
    public List<String> fetchVaccineByCost(Double startingRange, Double endingRange) {
        return repo.searchVaccineByCost(startingRange,endingRange);
    }

    @Override
    public int updateThePriceByVaccineName(Double newPrice, String vaccineName) {
        return repo.updatePriceByVaccineName(newPrice,vaccineName);
    }

    @Override
    public int deleteTheVaccinesByPriceRange(Double minPrice, Double maxPrice) {
        return repo.deleteVaccineByPriceRange(minPrice, maxPrice);
    }

    @Override
    public int insertVaccineDetails(Integer id,String vaccineName, String vaccineCompany, Double cost) {
        return repo.insertVaccineInfo(id,vaccineCompany,vaccineName,cost);
    }

    @Override
    public Date getSystemDateAndTime() {
        return repo.getTheSystemDateAndTime();
    }
}

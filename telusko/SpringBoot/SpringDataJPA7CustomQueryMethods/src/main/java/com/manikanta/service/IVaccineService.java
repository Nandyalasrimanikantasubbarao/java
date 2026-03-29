package com.manikanta.service;

import com.manikanta.entity.Vaccine;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IVaccineService {

    public List<Vaccine> fetchByVaccineCompany(String companyName);
    public List<Vaccine> fetchByVaccineCompany(String comp1,String comp2);
    public List<String> fetchVaccineByCost(Double startingRange,Double endingRange);
    public int updateThePriceByVaccineName(Double newPrice,String vaccineName);
    public int deleteTheVaccinesByPriceRange(Double minPrice,Double maxPrice);
    public int insertVaccineDetails(Integer id,String vaccineName,String vaccineCompany,Double cost);
    public Date getSystemDateAndTime();
}


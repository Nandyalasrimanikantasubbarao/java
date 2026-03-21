package com.manikanta.service;

import com.manikanta.entity.Vaccine;

import java.util.List;
import java.util.Optional;

public interface IVaccineService {
    public List<Vaccine> fetchByCost(Double cost);
    public List<Vaccine> fetchByCostLessThanEqual(Double cost);
    public List<Vaccine> fetchByCostBetween(Double startCost,Double endCost);
    public List<Vaccine> fetchByVaccineCompanyEquals(String companyName);

}

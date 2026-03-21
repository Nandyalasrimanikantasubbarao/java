package com.manikanta.repo;

import com.manikanta.entity.Vaccine;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IVaccineRepo extends JpaRepository<Vaccine,Integer> {

//    findBy-propertyName-keyword
    public List<Vaccine> findByCost(Double cost);
//    public List<Vaccine> findByCostIs(Double cost);
//    public List<Vaccine> findByCostEquals(Double cost);
    public List<Vaccine> findByCostLessThanEqual(Double cost);
    public List<Vaccine> findByCostBetween(Double startCost,Double endCost);
    public List<Vaccine> findByVaccineCompanyEquals(String companyName);
}

package com.manikanta.repo;

import com.manikanta.entity.Vaccine;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;

public interface IVaccineRepo extends JpaRepository<Vaccine,Integer> {

//    @Query("FROM Vaccine WHERE vaccineCompany=:company")
//    public List<Vaccine> searchByVaccineCompany(String company);


    @Query("FROM Vaccine WHERE vaccineCompany=:company")
    public List<Vaccine> searchByVaccineCompany(@Param("company")String companyName);


    @Query("FROM Vaccine WHERE vaccineCompany IN(:comp1,:comp2)")
    public List<Vaccine> searchByVaccineCompany(String comp1,String comp2);

    @Query("SELECT vaccineName,vaccineCompany FROM Vaccine WHERE cost BETWEEN :startingRange AND :endingRange")
    public List<String> searchVaccineByCost(Double startingRange,Double endingRange);

    @Transactional
    @Modifying
    @Query("UPDATE Vaccine SET cost=:newPrice WHERE vaccineName=:vaccineName")
    public int updatePriceByVaccineName(Double newPrice,String vaccineName);

    @Transactional
    @Modifying
    @Query("DELETE Vaccine WHERE cost BETWEEN :minPrice AND :maxPrice")
    public int deleteVaccineByPriceRange(Double minPrice,Double maxPrice);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO vaccine(`id`,`vaccine_name`,`vaccine_company`,`cost`) VALUES(?,?,?,?)",nativeQuery = true)
    public int insertVaccineInfo(Integer id,String vaccineName,String vaccineCompany,Double cost);


    @Query(value = "SELECT NOW()",nativeQuery = true)
    public Date getTheSystemDateAndTime();

}

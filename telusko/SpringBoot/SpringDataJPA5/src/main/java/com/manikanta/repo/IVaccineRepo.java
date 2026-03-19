package com.manikanta.repo;

import com.manikanta.entity.Vaccine;
import com.manikanta.view.ResultView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IVaccineRepo extends JpaRepository<Vaccine,Integer> {
//    cutsom finder method
//    findby-propertyName
    List<ResultView> findByCostLessThan(Double cost);
}

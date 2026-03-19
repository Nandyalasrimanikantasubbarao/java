package com.manikanta.repo;

import com.manikanta.entity.Vaccine;
import com.manikanta.view.ResultView;
import com.manikanta.view.View;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IVaccineRepo extends JpaRepository<Vaccine,Integer> {
//    cutsom finder method
//    findby-propertyName
    public<T extends View>List<T> findByCostLessThan(Double cost,Class<T> cls);
}

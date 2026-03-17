package com.manikanta.repo;

import com.manikanta.entity.Vaccine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IVaccineRepo extends PagingAndSortingRepository<Vaccine,Integer> {
}

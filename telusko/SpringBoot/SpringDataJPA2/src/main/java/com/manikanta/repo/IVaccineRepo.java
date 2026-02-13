package com.manikanta.repo;

import com.manikanta.entity.Vaccine;
import org.springframework.data.repository.CrudRepository;

public interface IVaccineRepo extends CrudRepository<Vaccine,Integer> {
}

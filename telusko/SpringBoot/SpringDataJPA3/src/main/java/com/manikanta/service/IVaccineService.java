package com.manikanta.service;

import com.manikanta.entity.Vaccine;

import java.util.List;
import java.util.Optional;

public interface IVaccineService {
    public Iterable<Vaccine> fetchDetailsBySorting(Boolean status,String... properties);
    public List<Vaccine> fetchDetailsByPagination(int pgNo,int pgSize,Boolean status,String... properties);
    public void fetchDetailsByPagination(int pageSize);
}

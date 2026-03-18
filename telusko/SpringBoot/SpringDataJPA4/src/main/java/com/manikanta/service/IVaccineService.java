package com.manikanta.service;

import com.manikanta.entity.Vaccine;

import java.util.List;
import java.util.Optional;

public interface IVaccineService {
    public Vaccine searchVaccineById(Integer id);
    public List<Vaccine> searchVaccineByGivenInfo(Vaccine vac);
    public String removeVaccineInfoByIds(Iterable<Integer> ids);
}

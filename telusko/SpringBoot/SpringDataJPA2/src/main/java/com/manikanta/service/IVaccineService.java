package com.manikanta.service;

import com.manikanta.entity.Vaccine;

public interface IVaccineService {
    public String registerVaccineInfo(Vaccine vaccine);

    public Iterable<Vaccine> registerMultipleVaccineInfo(Iterable<Vaccine> vaccine);

    public Long vaccinecount();
    public Boolean checkVaccineAvailability(Integer id);

    public Iterable<Vaccine> getAllVaccine();

}

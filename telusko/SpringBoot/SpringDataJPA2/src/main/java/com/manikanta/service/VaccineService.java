package com.manikanta.service;

import com.manikanta.entity.Vaccine;
import com.manikanta.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccineService implements  IVaccineService{

    private IVaccineRepo repo;

    @Autowired
    public void setRepo(IVaccineRepo repo){
        this.repo=repo;
    }

    @Override
    public String registerVaccineInfo(Vaccine vaccine) {
        Vaccine vac=repo.save(vaccine);
        return "Vaccine Info registerd with id"+vac.getId();
    }

    @Override
    public Iterable<Vaccine> registerMultipleVaccineInfo(Iterable<Vaccine> vaccine) {
        return repo.saveAll(vaccine);
    }

    @Override
    public Long vaccinecount() {
        return repo.count();
    }

    @Override
    public Boolean checkVaccineAvailability(Integer id) {
        return repo.existsById(id);
    }

    @Override
    public Iterable<Vaccine> getAllVaccine() {
        return repo.findAll();
    }
}

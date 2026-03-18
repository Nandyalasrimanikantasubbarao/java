package com.manikanta.service;

import com.manikanta.entity.Vaccine;
import com.manikanta.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VaccineService implements  IVaccineService{

    private  IVaccineRepo repo;

    @Autowired
    public void setRepo(IVaccineRepo repo){

        this.repo=repo;
    }

    @Override
    public Vaccine searchVaccineById(Integer id) {

        return repo.getReferenceById(id);
    }

    @Override
    public List<Vaccine> searchVaccineByGivenInfo(Vaccine vac) {
//        Sort sort=Sort.by(status? Sort.Direction.ASC: Sort.Direction.DESC,params);

        Example<Vaccine> exp=Example.of(vac);
        return repo.findAll(exp);

    }

    @Override
    public String removeVaccineInfoByIds(Iterable<Integer> ids) {
        List<Vaccine> list=repo.findAllById(ids);
        if(list.size()!=0){
            repo.deleteAllByIdInBatch(ids);
            return "Record deleted for given ids";
        }
        return "unable to delete records";
    }


}

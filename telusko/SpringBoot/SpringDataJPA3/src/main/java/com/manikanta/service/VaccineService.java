package com.manikanta.service;

import com.manikanta.entity.Vaccine;
import com.manikanta.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
    public Iterable<Vaccine> fetchDetailsBySorting(Boolean status, String... properties) {
        Sort sort=Sort.by(status? Sort.Direction.ASC:Sort.Direction.DESC,properties);
        return repo.findAll(sort);
    }

    @Override
    public List<Vaccine> fetchDetailsByPagination(int pgNo, int pgSize, Boolean status, String... properties) {
        Sort sort=Sort.by(status? Sort.Direction.ASC:Sort.Direction.DESC,properties);
        PageRequest pageable=PageRequest.of(pgNo,pgSize,sort);
        Page<Vaccine> page=repo.findAll(pageable);
        return page.getContent();
    }

    @Override
    public void fetchDetailsByPagination(int pageSize) {
        long count=41;

        long pageCount=count/pageSize;
        pageCount=count%pageSize==0?pageCount:++pageCount;
        for(int i=0;i<pageCount;i++){
            PageRequest pageable=PageRequest.of(i,pageSize);
            Page<Vaccine> page=repo.findAll(pageable);
            page.getContent().forEach(v-> System.out.println(v.getVaccineName()+" "+v.getVaccineCompany()));
            System.out.println("-----------------------");


        }
    }
}

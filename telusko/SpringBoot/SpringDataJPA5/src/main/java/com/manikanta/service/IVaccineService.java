package com.manikanta.service;

import com.manikanta.entity.Vaccine;
import com.manikanta.view.ResultView;

import java.util.List;
import java.util.Optional;

public interface IVaccineService {

    public List<ResultView> fetchByCost(Double cost);
}

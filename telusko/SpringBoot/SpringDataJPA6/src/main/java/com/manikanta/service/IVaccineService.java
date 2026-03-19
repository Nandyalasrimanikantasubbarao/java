package com.manikanta.service;

import com.manikanta.entity.Vaccine;
import com.manikanta.view.ResultView;
import com.manikanta.view.View;

import java.util.List;
import java.util.Optional;

public interface IVaccineService {
    public<T extends View>List<T> fetchByCostLessThan(Double cost, Class<T> cls);
}

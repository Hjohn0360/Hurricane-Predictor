package com.theelitelions20.HurricanePredictor.model.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeDao {

    @Autowired
    private HomeRepository repository;
}

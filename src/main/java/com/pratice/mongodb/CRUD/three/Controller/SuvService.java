package com.pratice.mongodb.CRUD.three.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratice.mongodb.CRUD.three.DAO.SuvDAO;
import com.pratice.mongodb.CRUD.three.DAO.SuvModel;

import java.util.Collection;
import java.util.Optional;

@Service
public class SuvService {
	
    @Autowired
    private SuvDAO suvDAO;

    public Collection<SuvModel> getSuvs() {
        return suvDAO.getSuvs();
    }

    public SuvModel createSuv(SuvModel suv) {
        return suvDAO.createSuv(suv);
    }

    public Optional<SuvModel> getSuvById(int id) {
        return suvDAO.getSuvById(id);
    }

    public Optional<SuvModel> deleteSuvById(int id) {
        return suvDAO.deleteSuvById(id);
    }

    public Optional<SuvModel> updateSuvById(int id, SuvUpdatePayload SuvUpdatePayload) {
        return suvDAO.updateSuvById(id, SuvUpdatePayload);
    }
}


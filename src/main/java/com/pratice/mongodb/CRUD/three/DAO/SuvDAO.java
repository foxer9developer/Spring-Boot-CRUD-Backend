package com.pratice.mongodb.CRUD.three.DAO;


import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pratice.mongodb.CRUD.three.Controller.SuvUpdatePayload;
import com.pratice.mongodb.CRUD.three.service.SuvRepository;

@Component
public class SuvDAO {

    @Autowired
    private SuvRepository suvRepo;

    public Collection<SuvModel> getSuvs() {
        return suvRepo.findAll();
    }

    public SuvModel createSuv(SuvModel suv) {
        return suvRepo.insert(suv);
    }

    public Optional<SuvModel> getSuvById(int id) {
        return suvRepo.findById(id);
    }

    public Optional<SuvModel> deleteSuvById(int id) {
         Optional<SuvModel> suv = suvRepo.findById(id);
         suv.ifPresent(b -> suvRepo.delete(b));
         return suv;
    }

    public Optional<SuvModel> updateSuvById(int id, SuvUpdatePayload SuvUpdatePayload) {
        Optional<SuvModel> book = suvRepo.findById(id);
        book.ifPresent(b -> b.setName(SuvUpdatePayload.getName()));
        book.ifPresent(b -> b.setModel(SuvUpdatePayload.getModel()));
        book.ifPresent(b -> suvRepo.save(b));
        return book;
    }
}


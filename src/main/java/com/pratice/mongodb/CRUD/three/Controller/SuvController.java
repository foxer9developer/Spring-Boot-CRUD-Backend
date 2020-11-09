package com.pratice.mongodb.CRUD.three.Controller;

import java.util.Collection;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.Null;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pratice.mongodb.CRUD.three.DAO.SuvModel;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@RestController
@RequestMapping("/Suvs")
public class SuvController {

   @Autowired
   private SuvService suvService;
   
   @GetMapping
   public String getSuvs() {
	   return "Hello WOrld";
   }
   
//    @GetMapping
//    public Collection<SuvModel> getSuvs() {
//        return suvService.getSuvs();
//    }

    @PostMapping("/saveSuv")
    public SuvModel postSuv(@Valid @RequestBody SuvModel suv) {
    				return suvService.createSuv(suv);
    		    
    }

    @GetMapping(value="/{id}")
    public Optional<SuvModel> getSuvById(@PathVariable("id") int id) {
        return suvService.getSuvById(id);
    }

    @DeleteMapping(value="/{id}")
    public Optional<SuvModel> deleteSuvById(@PathVariable("id") int id) {
        return suvService.deleteSuvById(id);
    }

    @PutMapping(value="/{id}")
    public Optional<SuvModel> UpdateSuvById(@PathVariable("id") int id, @RequestBody SuvUpdatePayload
            suvUpdatePayload) {
        return suvService.updateSuvById(id, suvUpdatePayload);
    }



}

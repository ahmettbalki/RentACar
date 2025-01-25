package com.ahmetbalki.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahmetbalki.rentACar.entities.concretes.Model;

public interface ModelRepository extends JpaRepository<Model, Integer> {

}

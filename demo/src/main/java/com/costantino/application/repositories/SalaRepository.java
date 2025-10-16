package com.costantino.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.costantino.application.entities.SalaEntity;
@Repository
public interface SalaRepository extends JpaRepository<SalaEntity,Long> {

}

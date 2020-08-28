package com.example.springbootmap.repositories;

import com.example.springbootmap.models.Thing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThingRepository extends JpaRepository<Thing, Long> {}

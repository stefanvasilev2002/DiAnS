package com.finki.heritagehub.repository;

import com.finki.heritagehub.model.Monument;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MonumentRepository extends JpaRepository<Monument, Long> {
    Monument findMonumentById(Long id);
    List<Monument> findAllByOrderById();
    List<Monument> findAllByHistoricIsTrueOrderById();
    List<Monument> findAllByCulturalIsTrueOrderById();
    List<Monument> findAllByCityContainingIgnoreCaseAndNameContainingIgnoreCase(String city, String name);
    List<Monument> findAllByNameContainingIgnoreCase(String name);
    List<Monument> findAllByCityContainingIgnoreCase(String city);

}

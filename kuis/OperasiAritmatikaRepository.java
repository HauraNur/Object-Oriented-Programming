package com.pbo.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperasiAritmatikaRepository
        extends JpaRepository<OperasiAritmatika, Integer> {

}
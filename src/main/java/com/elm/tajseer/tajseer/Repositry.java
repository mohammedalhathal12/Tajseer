package com.elm.tajseer.tajseer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositry extends JpaRepository<student, Integer> {

}

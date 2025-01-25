package com.nasser.urlfeederservice.dao;

import com.nasser.urlfeederservice.model.URL;
import org.springframework.data.jpa.repository.JpaRepository;

public interface URLRepository extends JpaRepository<URL, String> {
}

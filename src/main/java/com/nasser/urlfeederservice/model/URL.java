package com.nasser.urlfeederservice.model;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class URL {
    @Id
    String id;

    String url;
    @Column(name = "created_date")
    Timestamp createdDate;
}

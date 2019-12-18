package com.webcorestone.DMS.daoI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcorestone.DMS.model.NursDetails;

@Repository
public interface NursDaoI extends JpaRepository<NursDetails, Integer>{

}

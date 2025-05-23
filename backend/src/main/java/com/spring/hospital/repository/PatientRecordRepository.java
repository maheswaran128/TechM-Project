package com.spring.hospital.repository;

import com.spring.hospital.model.PatientRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRecordRepository extends JpaRepository<PatientRecord, Long> {
    List<PatientRecord> findByPatientId(Long patientId);
}

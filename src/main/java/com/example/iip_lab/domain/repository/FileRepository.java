package com.example.iip_lab.domain.repository;

import com.example.iip_lab.domain.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
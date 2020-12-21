package com.iip.lab_page.domain.repository;

import com.iip.lab_page.domain.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
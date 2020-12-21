package com.iip.lab_page.domain.repository;

import com.iip.lab_page.domain.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
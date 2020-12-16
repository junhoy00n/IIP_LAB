package com.example.iip_lab.domain.repository;

import com.example.iip_lab.domain.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
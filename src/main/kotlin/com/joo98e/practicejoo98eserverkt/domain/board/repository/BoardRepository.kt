package com.joo98e.practicejoo98eserverkt.domain.board.repository

import com.joo98e.practicejoo98eserverkt.domain.board.model.Board
import org.springframework.data.jpa.repository.JpaRepository

interface BoardRepository : JpaRepository<Board, Long> {
}

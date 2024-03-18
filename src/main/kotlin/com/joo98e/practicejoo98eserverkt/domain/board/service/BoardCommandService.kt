package com.joo98e.practicejoo98eserverkt.domain.board.service

import com.joo98e.practicejoo98eserverkt.domain.board.dto.request.BoardCreateCommand
import com.joo98e.practicejoo98eserverkt.domain.board.repository.BoardRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class BoardCommandService(
    private val boardRepository: BoardRepository,
) {
    @Transactional
    fun save(command: BoardCreateCommand): Long {
        val board = boardRepository.save(command.toEntity())
        return board.id ?: throw RuntimeException("Board id is null")
    }
}

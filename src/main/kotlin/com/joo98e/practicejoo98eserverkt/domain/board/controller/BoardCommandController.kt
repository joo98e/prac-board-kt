package com.joo98e.practicejoo98eserverkt.domain.board.controller

import com.joo98e.practicejoo98eserverkt.domain.board.dto.request.BoardCreateCommand
import com.joo98e.practicejoo98eserverkt.domain.board.dto.request.BoardUpdateCommand
import org.springframework.web.bind.annotation.*

@RestController
class BoardCommandController {
    @PostMapping("/boards")
    fun createBoard(
        @RequestBody command: BoardCreateCommand,
    ): Long {
        return 1L
    }

    @PutMapping("/boards/{id}")
    fun updateBoard(
        @PathVariable id: Long,
        @RequestBody command: BoardUpdateCommand,
    ): Long {
        return 1L
    }
}

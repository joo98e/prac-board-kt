package com.joo98e.practicejoo98eserverkt.domain.board.controller

import com.joo98e.practicejoo98eserverkt.domain.board.dto.BoardCreateCommand
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BoardCommandController {
    @PostMapping("/boards")
    fun createBoard(
        @RequestBody command: BoardCreateCommand,
    ): Long {
        return 1L
    }
}

package com.joo98e.practicejoo98eserverkt.domain.board.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BoardQueryController() {

    @GetMapping("/boards")
    fun getBoards() {
    }

    @PostMapping("/boards")
    fun createBoard() {
    }
}

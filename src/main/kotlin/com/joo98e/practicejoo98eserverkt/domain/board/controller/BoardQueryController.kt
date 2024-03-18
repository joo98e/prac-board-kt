package com.joo98e.practicejoo98eserverkt.domain.board.controller

import com.joo98e.practicejoo98eserverkt.domain.board.dto.response.BoardDetailResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class BoardQueryController() {
    @GetMapping("/boards/{id}")
    fun getBoard(
        @PathVariable id: Long,
    ): BoardDetailResponse {
        return BoardDetailResponse(
            id = 2L,
            title = "title",
            content = "content",
            createdAt = "2021-01-01T00:00:00",
            createdBy = "author",
        )
    }

    @GetMapping("/boards")
    fun getBoards(): List<BoardDetailResponse> {
        return listOf(
            BoardDetailResponse(
                id = 1L,
                title = "title",
                content = "content",
                createdAt = "2021-01-01T00:00:00",
                createdBy = "author",
            )
        )
    }
}

package com.joo98e.practicejoo98eserverkt.domain.board.dto.request

import com.joo98e.practicejoo98eserverkt.domain.board.model.Board

data class BoardCreateCommand(
    val title: String,
    val content: String,
) {
    fun toEntity(): Board {
        return Board(
            title = title,
            content = content,
        )
    }
}

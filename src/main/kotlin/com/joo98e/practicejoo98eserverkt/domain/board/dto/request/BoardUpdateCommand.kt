package com.joo98e.practicejoo98eserverkt.domain.board.dto.request

data class BoardUpdateCommand(
    val id: Long,
    val title: String,
    val content: String,
)

package com.joo98e.practicejoo98eserverkt.domain.board.dto.response

data class BoardDetailResponse(
    val id: Long,
    val title: String,
    val content: String,
    val createdBy: String,
    val createdAt: String,
)

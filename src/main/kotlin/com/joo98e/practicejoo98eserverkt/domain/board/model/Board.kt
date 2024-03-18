package com.joo98e.practicejoo98eserverkt.domain.board.model

import com.joo98e.practicejoo98eserverkt.domain.common.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Board(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    var title: String,
    var content: String,
) : BaseEntity() {
}

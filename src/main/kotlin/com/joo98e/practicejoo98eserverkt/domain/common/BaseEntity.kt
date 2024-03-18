package com.joo98e.practicejoo98eserverkt.domain.common

import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDate

@MappedSuperclass
abstract class BaseEntity {
    @Column(nullable = false, updatable = false)
    val createdAt: LocalDate = LocalDate.now()

    @LastModifiedDate
    @Column(nullable = false)
    var updatedAt: LocalDate = LocalDate.now()
        protected set
}

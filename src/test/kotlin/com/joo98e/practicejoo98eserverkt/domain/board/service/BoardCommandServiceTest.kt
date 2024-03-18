package com.joo98e.practicejoo98eserverkt.domain.board.service

import com.joo98e.practicejoo98eserverkt.domain.board.dto.request.BoardCreateCommand
import com.joo98e.practicejoo98eserverkt.domain.board.repository.BoardRepository
import com.joo98e.practicejoo98eserverkt.test.SpringTest
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

class BoardCommandServiceTest : SpringTest() {

    @Autowired
    private lateinit var sut: BoardCommandService

    @Autowired
    private lateinit var boardRepository: BoardRepository

    @Test
    fun `보드 생성 테스트`() {
        // given
        val title = "제목"
        val content = "내용"
        val command = BoardCreateCommand(
            title = title,
            content = content,
        )

        // when
        sut.save(command = command)

        // then
        boardRepository.findAll().let {
            it.size shouldBe 1
            it[0].title shouldBe title
            it[0].content shouldBe content
        }
    }
}

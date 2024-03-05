package com.joo98e.practicejoo98eserverkt

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class BoardServerApplicationTests : BehaviorSpec({
    given("a test") {
        `when`("I run a test") {
            then("it should pass") {
                1 + 1 shouldBe 2
            }
        }
    }
})

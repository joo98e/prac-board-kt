package com.joo98e.practicejoo98eserverkt

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class BoardServerApplicationTests : BehaviorSpec({
    Given("a test") {
        When("running a test") {
            Then("it should pass") {
                true shouldBe true
            }
        }
    }
})

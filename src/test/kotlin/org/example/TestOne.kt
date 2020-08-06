package org.example

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TestOne : TestBase() {

    @Test
    fun `Test one`() {
        assertThat(true).isTrue()
    }

}

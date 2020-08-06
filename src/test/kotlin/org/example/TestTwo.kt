package org.example

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TestTwo : TestBase() {

    @Test
    fun `Test two`() {
        assertThat(true).isTrue()
    }

}

package org.example

import com.ninjasquad.springmockk.SpykBean
import io.mockk.clearMocks
import org.example.service.SomeService
import org.junit.jupiter.api.AfterEach
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TestBase {

    @SpykBean
    protected lateinit var someService: SomeService

    @AfterEach
    fun resetSpy() = clearMocks(someService)

}

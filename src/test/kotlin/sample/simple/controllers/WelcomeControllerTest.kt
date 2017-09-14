package sample.simple.controllers

import org.hamcrest.Matchers.containsString
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.BDDMockito.anyString
import org.mockito.BDDMockito.given
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import sample.simple.controllers.WelcomeController
import sample.simple.services.WelcomeService


@RunWith(SpringRunner::class)
@WebMvcTest(WelcomeController::class)
class WelcomeControllerTest {

  @Autowired
  private val mvc: MockMvc? = null

  @MockBean
  private val welcomeService: WelcomeService? = null

  @Test
  fun welcomeTest() {
    given(welcomeService!!.sayHello(anyString()))
        .willReturn("Hello")

    mvc!!.perform(get("/"))
        .andExpect(status().isOk)
        .andExpect(content().string(containsString("Hello")))
  }
}
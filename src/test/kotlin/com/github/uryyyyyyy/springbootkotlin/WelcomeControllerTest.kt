package com.github.uryyyyyyy.springbootkotlin

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc

import org.hamcrest.Matchers.containsString
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@RunWith(SpringRunner::class)
@WebMvcTest(WelcomeController::class)
class WelcomeControllerTest {

    @Autowired
    private val mvc: MockMvc? = null

    @Test
    @Throws(Exception::class)
    fun welcomeTest() {
        mvc!!.perform(get("/"))
                .andExpect(status().isOk)
                .andExpect(content().string(containsString("Hello")))
    }
}
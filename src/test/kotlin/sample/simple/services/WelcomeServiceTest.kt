package sample.simple.services

import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.*
import sample.simple.daos.WelcomeDao

class WelcomeServiceTest {

  @Test
  fun sayHelloTest() {
    val welcomeDao = mock(WelcomeDao::class.java)
    `when`(welcomeDao.insert(anyString())).thenReturn(-1)
    `when`(welcomeDao.selectAllName()).thenReturn(listOf("a"))

    val service = WelcomeService(welcomeDao)
    assertEquals("Hello, World!", service.sayHello("World"))
  }

}
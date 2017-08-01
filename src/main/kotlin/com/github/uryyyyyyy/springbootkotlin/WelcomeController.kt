package com.github.uryyyyyyy.springbootkotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
open class WelcomeController {

  @GetMapping("/")
  fun welcome(): String {
    return "Hello, World!"
  }

}
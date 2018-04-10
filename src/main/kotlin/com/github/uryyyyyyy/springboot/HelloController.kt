package com.github.uryyyyyyy.springboot

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

  @GetMapping("/")
  fun welcome(): String {
    return "Hello, World!!!"
  }

}
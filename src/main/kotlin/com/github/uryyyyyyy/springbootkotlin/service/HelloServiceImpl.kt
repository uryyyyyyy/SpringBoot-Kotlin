package com.github.uryyyyyyy.springbootkotlin.service

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile("prod")
class HelloServiceImpl: HelloService{

  override fun say(name: String): String {
    return "Hello, ${name}!"
  }
}

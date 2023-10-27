package com.example.flashcards

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class HomeController{

    @GetMapping
    fun get():String = "Hello, this is Spring Kotlin!"
}
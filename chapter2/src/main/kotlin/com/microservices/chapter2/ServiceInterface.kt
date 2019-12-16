package com.microservices.chapter2

import org.springframework.stereotype.Component

@Component
interface ServiceInterface {
    fun getHello(name: String) : String
}
package com.ftx.h1.outside.controller

import org.reactivestreams.Publisher
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.stereotype.Controller
import reactor.core.publisher.Mono

@Controller
class RSocketController {

    @MessageMapping("HANDS")
    fun consumeHand(hm2Hand: String): Publisher<String> = Mono.just("RESPONSE")

}

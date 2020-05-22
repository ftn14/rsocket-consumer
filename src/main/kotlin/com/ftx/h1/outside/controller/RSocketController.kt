package com.ftx.h1.inside.controller

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.stereotype.Controller
import reactor.core.publisher.Mono

@Controller
class RSocketController {

    @MessageMapping("hands")
    suspend fun consumeHand(hm2Hand: String): Mono<String> = Mono.just("received:$hm2Hand")

}
package com.ftx.h1.outside.controller

import mu.KotlinLogging
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.stereotype.Controller
import reactor.core.publisher.Mono

private val logger = KotlinLogging.logger {}

@Controller
class RSocketController {

    @MessageMapping("HANDS")
    suspend fun consumeHand(hm2Hand: String): Mono<Void> {
        logger.info { "received: $hm2Hand" }
        return Mono.empty()
    }
}

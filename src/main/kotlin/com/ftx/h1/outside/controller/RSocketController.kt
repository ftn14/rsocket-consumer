package com.ftx.h1.outside.controller

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.reactor.mono
import mu.KotlinLogging
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.stereotype.Controller
import reactor.core.publisher.Mono

private val logger = KotlinLogging.logger {}

@Controller
class RSocketController {

    @MessageMapping("HANDS")
    fun consumeHand(hm2Hand: String): Mono<String> = mono {
        logger.info { "received: $hm2Hand" }
        val result = GlobalScope.async {
            "result"
        }
        result.await()
    }
}

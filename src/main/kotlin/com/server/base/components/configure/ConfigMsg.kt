package com.server.base.components.configure

import java.time.LocalDateTime

fun  msg (config: String) {
    val RESET: String = "\u001B[0m";
    val FONT_GREEN = "\u001B[32m";
    println(String.format(" %s ::::::::::::: %s ::::: %sON%s", LocalDateTime.now(), config, FONT_GREEN, RESET));
}

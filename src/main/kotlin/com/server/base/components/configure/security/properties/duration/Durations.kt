package com.server.base.components.configure.security.properties.duration

import lombok.Getter

@Getter
enum class Durations {

    HOUR_1(1000L * 60L * 60L * 1L),
    HOUR_3(1000L * 60L * 60L * 3L),
    HOUR_6(1000L * 60L * 60L * 6L),
    HOUR_10(1000L * 60L * 60L * 10L),
    INFINITE(Long.MAX_VALUE);

    val time: Long
    constructor(time: Long) {
        this.time = time;
    }
}
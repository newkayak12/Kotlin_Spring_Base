package com.server.base.components.expcetions


open class CommonException(reason: BecauseOf): Exception(message = reason.getMsg()) {
}
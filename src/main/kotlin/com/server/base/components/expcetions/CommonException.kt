package com.server.base.components.expcetions


open class CommonException(reason: BecauseOf): Exception(reason.getMsg()) {
}
package com.server.base.repository.dto.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.server.base.repository.dto.reference.AccountDto

@JsonIgnoreProperties(value = [
    "userNo",
    "regDate",
])
class SignUpRequest(): AccountDto() {
}
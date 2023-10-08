package com.server.base.components.constants

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component(value = "constants")
class Constants {

    companion object{
        public lateinit var SALT: String;
        public lateinit var TOKEN_NAME: String;
        public lateinit var PROJECT_NAME: String;
        public lateinit var EMAIL: String;
        public lateinit var EMAIL_KEY: String;
        public var AUTHORIZATION: String = "Authorization";
        public var REFRESH_TOKEN: String = "Refresh";
    }

    @Value("\${constant.salt}")
    public fun setSalt(_SALT: String ) { SALT = _SALT; }
    @Value("\${constant.token_name}")
    public fun setTokenName( _TOKEN_NAME: String ) { TOKEN_NAME = _TOKEN_NAME; }
    @Value("\${constant.project_name}")
    public fun setProjectName( _PROJECT_NAME: String ) { PROJECT_NAME = _PROJECT_NAME; }
    @Value("\${constant.email}")
    public fun setEmail( _EMAIL: String ) { EMAIL = _EMAIL; }
    @Value("\${constant.email_key}")
    public fun setEmailKey( _EMAIL_KEY: String ) { EMAIL_KEY = _EMAIL_KEY; }

}
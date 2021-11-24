/*
 * *
 *  * Created by Valentin Grachev on 25.11.2021, 0:12
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 24.11.2021, 23:40
 *
 */

package com.jizoquval.clapperboard.feature.authentication

interface AuthenticationComponent {
    fun dispatch(intent: Intent)

    sealed interface Intent {
        data class AuthPressed(
            val login: String,
            val password: String
        ) : Intent
    }
}
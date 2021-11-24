/*
 * *
 *  * Created by Valentin Grachev on 25.11.2021, 0:12
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 24.11.2021, 23:40
 *
 */

package com.jizoquval.clapperboard.feature.authentication

import android.util.Log
import com.arkivanov.decompose.ComponentContext

class AuthenticationComponentImpl(
    componentContext: ComponentContext,
    private val onAuth: () -> Unit
) : AuthenticationComponent, ComponentContext by componentContext {

    override fun dispatch(intent: AuthenticationComponent.Intent) {
        when (intent) {
            is AuthenticationComponent.Intent.AuthPressed -> {
                Log.e("AUTH", "l ${intent.login} p ${intent.password}")
                onAuth()
            }
        }
    }
}
/*
 * *
 *  * Created by Valentin Grachev on 25.11.2021, 0:12
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 24.11.2021, 23:40
 *
 */

package com.jizoquval.clapperboard.screen.authentication

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.jizoquval.clapperboard.feature.authentication.AuthenticationComponent

@Composable
fun AuthenticationScreen(component: AuthenticationComponent) {
    Button(
        onClick = {
            component.dispatch(
                AuthenticationComponent.Intent.AuthPressed("dd", "xx")
            )
        }
    ) {
        Text(text = "auth")
    }
}
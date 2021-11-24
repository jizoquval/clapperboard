/*
 * *
 *  * Created by Valentin Grachev on 25.11.2021, 0:12
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 24.11.2021, 23:36
 *
 */

package com.jizoquval.clapperboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.arkivanov.decompose.defaultComponentContext
import com.jizoquval.clapperboard.feature.bootstrap.BootstrapComponentImpl
import com.jizoquval.clapperboard.feature.theme.ClapperboardTheme
import com.jizoquval.clapperboard.screen.splashScreen.AppBootstrap

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val appBootstrap = BootstrapComponentImpl(
            componentContext = defaultComponentContext(),
            isAuthorized = false
        )
        setContent {
            ClapperboardTheme {
                AppBootstrap(appBootstrap)
            }
        }
    }
}
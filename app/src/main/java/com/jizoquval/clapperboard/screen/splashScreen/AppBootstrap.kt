/*
 * *
 *  * Created by Valentin Grachev on 25.11.2021, 0:12
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 24.11.2021, 23:18
 *
 */

package com.jizoquval.clapperboard.screen.splashScreen

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.extensions.compose.jetpack.Children
import com.jizoquval.clapperboard.feature.bootstrap.BootstrapComponentImpl
import com.jizoquval.clapperboard.feature.bootstrap.BootstrapComponent
import com.jizoquval.clapperboard.screen.authentication.AuthenticationScreen
import com.jizoquval.clapperboard.screen.movieList.MovieListScreen

@Composable
fun AppBootstrap(
    component: BootstrapComponentImpl
) {
    Children(
        routerState = component.routerState,
    ) { child ->
        when (val instance = child.instance) {
            is BootstrapComponent.Child.Authentication -> {
                AuthenticationScreen(instance.component)
            }
            is BootstrapComponent.Child.MoviesList -> {
                MovieListScreen(instance.component)
            }
        }
    }
}
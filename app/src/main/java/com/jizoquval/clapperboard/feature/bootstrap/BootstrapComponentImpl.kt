/*
 * *
 *  * Created by Valentin Grachev on 25.11.2021, 0:12
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 24.11.2021, 23:36
 *
 */

package com.jizoquval.clapperboard.feature.bootstrap

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.replaceCurrent
import com.arkivanov.decompose.router.router
import com.jizoquval.clapperboard.feature.authentication.AuthenticationComponentImpl
import com.jizoquval.clapperboard.feature.bootstrap.BootstrapComponent.Child
import com.jizoquval.clapperboard.feature.bootstrap.BootstrapComponent.RouterConfig
import com.jizoquval.clapperboard.feature.movie.MoviesListComponentImpl

class BootstrapComponentImpl(
    private val isAuthorized: Boolean,
    componentContext: ComponentContext,
) : BootstrapComponent, ComponentContext by componentContext {

    private val router = router(
        initialConfiguration = ::initialConfiguration,
        childFactory = ::childFactory
    )

    override val routerState = router.state

    private fun initialConfiguration(): RouterConfig =
        if (isAuthorized) RouterConfig.MoviesList else RouterConfig.Authentication

    private fun childFactory(config: RouterConfig, context: ComponentContext): Child =
        when (config) {
            RouterConfig.Authentication -> {
                Child.Authentication(
                    component = AuthenticationComponentImpl(
                        context,
                        onAuth = {
                            router.replaceCurrent(RouterConfig.MoviesList)
                        }
                    )
                )
            }
            RouterConfig.MoviesList -> {
                Child.MoviesList(
                    component = MoviesListComponentImpl(context)
                )
            }
        }
}
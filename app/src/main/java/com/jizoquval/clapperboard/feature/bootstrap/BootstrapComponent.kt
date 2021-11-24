/*
 * *
 *  * Created by Valentin Grachev on 25.11.2021, 0:12
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 25.11.2021, 0:12
 *
 */

package com.jizoquval.clapperboard.feature.bootstrap

import com.arkivanov.decompose.router.RouterState
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.parcelable.Parcelable
import com.arkivanov.essenty.parcelable.Parcelize
import com.jizoquval.clapperboard.feature.authentication.AuthenticationComponentImpl
import com.jizoquval.clapperboard.feature.movie.MoviesListComponentImpl

interface BootstrapComponent {

    val routerState: Value<RouterState<RouterConfig, Child>>

    sealed interface Child {
        class Authentication(val component: AuthenticationComponentImpl) : Child
        class MoviesList(val component: MoviesListComponentImpl) : Child
    }

    sealed interface RouterConfig : Parcelable {
        @Parcelize
        object Authentication : RouterConfig

        @Parcelize
        object MoviesList : RouterConfig
    }
}
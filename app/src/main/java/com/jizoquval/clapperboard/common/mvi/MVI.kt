/*
 * *
 *  * Created by Valentin Grachev on 25.11.2021, 16:45
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 25.11.2021, 16:45
 *
 */

package com.jizoquval.clapperboard.common.mvi

import com.arkivanov.decompose.value.Value

interface MVI<Intent : Any, ViewState : Any, Action : Any> {
    val viewState: Value<ViewState>
    val actionEmitter: ActionEmitter<Action>
    fun obtainIntent(intent: Intent)
}
/*
 * *
 *  * Created by Valentin Grachev on 25.11.2021, 17:15
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 25.11.2021, 17:15
 *
 */

package com.jizoquval.clapperboard.common.mvi.composeExtenstion

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import com.jizoquval.clapperboard.common.mvi.ActionEmitter
import com.jizoquval.clapperboard.common.mvi.ActionObserver

@Composable
fun <T : Any> ActionHandler(
    emitter: ActionEmitter<T>,
    onAction: (T) -> Unit
) {
    DisposableEffect(emitter) {
        val observer: ActionObserver<T> = onAction
        emitter.subscribe(observer)
        onDispose {
            emitter.unsubscribe(observer)
        }
    }
}
/*
 * *
 *  * Created by Valentin Grachev on 25.11.2021, 16:53
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 25.11.2021, 16:53
 *
 */

package com.jizoquval.clapperboard.common.mvi

typealias ActionObserver<T> = (T) -> Unit

class ActionEmitter<T : Any> {
    private var observers = emptySet<ActionObserver<T>>()

    fun emit(action: T) {
        observers.forEach {
            it(action)
        }
    }

    fun subscribe(observer: ActionObserver<T>) {
        observers = observers + observer
    }

    fun unsubscribe(observer: ActionObserver<T>) {
        observers = observers - observer
    }
}
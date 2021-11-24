/*
 * *
 *  * Created by Valentin Grachev on 25.11.2021, 0:12
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 25.11.2021, 0:09
 *
 */

package com.jizoquval.clapperboard.screen.movieList

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.jizoquval.clapperboard.feature.movie.MoviesListComponent

@Composable
fun MovieListScreen(component: MoviesListComponent) {

    ExploreText()
}

@Composable
fun ExploreText() {
    Column(Modifier.background(color = MaterialTheme.colorScheme.background)) {
        Text(
            text = "Explore", style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = "Let’s find your favorite movie", style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}
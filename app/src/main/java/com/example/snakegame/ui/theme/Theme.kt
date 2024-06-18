package com.example.snakegame.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable




private val ColorPalette = lightColors(
    primary = DarkOrange,
    primaryVariant = DarkOrange,
    secondary = LightOrange,
    background = LightOrange
)

@Composable
fun SnakeGameTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {

    MaterialTheme(
        colors = ColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )

}
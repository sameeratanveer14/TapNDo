package com.tapndo.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SplashScreen(onNavigate: () -> Unit = {}) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text("TapNDo", style = MaterialTheme.typography.headlineLarge)
        // TODO: Add your app logo here if needed
        // Simulate loading
        LaunchedEffect(true) {
            kotlinx.coroutines.delay(1500)
            onNavigate()
        }
    }
}

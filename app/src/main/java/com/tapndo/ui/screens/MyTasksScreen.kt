package com.tapndo.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun MyTasksScreen() {
    Scaffold(
        topBar = { TopAppBar(title = { Text("My Tasks") }) }
    ) { padding ->
        Column(modifier = Modifier.padding(padding).padding(16.dp)) {
            Text("Your posted and accepted tasks will show here.")
            // TODO: Show list of user's tasks
        }
    }
}

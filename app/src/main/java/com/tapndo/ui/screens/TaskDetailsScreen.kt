package com.tapndo.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun TaskDetailsScreen(taskId: String?, onAccept: () -> Unit = {}) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Task Details") }) }
    ) { padding ->
        Column(modifier = Modifier.padding(padding).padding(16.dp)) {
            Text("Task Details for $taskId")
            // TODO: Display full task details here
            Spacer(Modifier.height(16.dp))
            Button(onClick = onAccept) {
                Text("Accept Task")
            }
        }
    }
}

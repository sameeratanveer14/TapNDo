package com.tapndo.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(onTaskClick: (String) -> Unit = {}, onPostTask: () -> Unit = {}) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Tasks Feed") })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = onPostTask) {
                Text("+")
            }
        }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding).padding(16.dp)) {
            Text("List of Tasks", style = MaterialTheme.typography.headlineSmall)
            // TODO: Replace with LazyColumn of tasks
            Button(onClick = { onTaskClick("taskId") }) {
                Text("Tap to view task details")
            }
        }
    }
}

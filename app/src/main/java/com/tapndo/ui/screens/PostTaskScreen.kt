package com.tapndo.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun PostTaskScreen(onPost: () -> Unit = {}) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Post New Task") }) }
    ) { padding ->
        Column(modifier = Modifier.padding(padding).padding(16.dp)) {
            Text("Task Details Form")
            // TODO: Add form fields for task posting
            Spacer(Modifier.height(16.dp))
            Button(onClick = onPost) {
                Text("Post Task")
            }
        }
    }
}

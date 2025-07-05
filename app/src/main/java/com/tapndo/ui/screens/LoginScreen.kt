package com.tapndo.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(onLogin: () -> Unit = {}) {
    Column(
        modifier = Modifier.fillMaxSize().padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Welcome to TapNDo", style = MaterialTheme.typography.headlineMedium)
        Spacer(Modifier.height(16.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Phone Number") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(16.dp))
        Button(onClick = onLogin, modifier = Modifier.fillMaxWidth()) {
            Text("Send OTP")
        }
    }
}

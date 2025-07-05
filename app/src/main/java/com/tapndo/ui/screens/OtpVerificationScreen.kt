package com.tapndo.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun OtpVerificationScreen(taskId: String?, onVerify: () -> Unit = {}) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("OTP Verification") }) }
    ) { padding ->
        Column(modifier = Modifier.padding(padding).padding(16.dp)) {
            Text("Enter OTP for Task #$taskId")
            // TODO: OTP input
            Spacer(Modifier.height(16.dp))
            Button(onClick = onVerify) {
                Text("Verify OTP")
            }
        }
    }
}

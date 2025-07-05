package com.tapndo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.tapndo.ui.screens.*

@Composable
fun AppNavHost() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "splash") {
        composable("splash") { SplashScreen { navController.navigate("login") } }
        composable("login") { LoginScreen { navController.navigate("home") } }
        composable("home") { HomeScreen(
            onTaskClick = { taskId -> navController.navigate("taskDetails/$taskId") },
            onPostTask = { navController.navigate("postTask") }
        ) }
        composable("taskDetails/{taskId}") { backStackEntry ->
            TaskDetailsScreen(
                taskId = backStackEntry.arguments?.getString("taskId"),
                onAccept = { navController.navigate("otpVerification/${backStackEntry.arguments?.getString("taskId")}") }
            )
        }
        composable("postTask") { PostTaskScreen { navController.navigate("home") } }
        composable("myTasks") { MyTasksScreen() }
        composable("chat/{chatId}") { backStackEntry ->
            ChatScreen(chatId = backStackEntry.arguments?.getString("chatId"))
        }
        composable("profile") { ProfileScreen() }
        composable("otpVerification/{taskId}") { backStackEntry ->
            OtpVerificationScreen(
                taskId = backStackEntry.arguments?.getString("taskId"),
                onVerify = { navController.navigate("home") }
            )
        }
    }
}

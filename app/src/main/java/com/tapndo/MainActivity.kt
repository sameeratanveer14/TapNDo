package com.tapndo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.tapndo.navigation.AppNavHost
import com.tapndo.ui.theme.TapNDoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TapNDoTheme {
                Surface {
                    AppNavHost()
                }
            }
        }
    }
}

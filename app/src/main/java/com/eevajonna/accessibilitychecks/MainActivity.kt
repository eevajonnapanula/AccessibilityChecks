package com.eevajonna.accessibilitychecks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.eevajonna.accessibilitychecks.ui.screens.AccessibilityIssuesScreen
import com.eevajonna.accessibilitychecks.ui.theme.AccessibilityChecksTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AccessibilityChecksTheme {
                AccessibilityIssuesScreen()
            }
        }
    }
}

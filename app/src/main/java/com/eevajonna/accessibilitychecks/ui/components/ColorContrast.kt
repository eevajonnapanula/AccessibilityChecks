package com.eevajonna.accessibilitychecks.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.eevajonna.accessibilitychecks.ui.theme.AccessibilityChecksTheme

@Composable
fun ColorContrast() {
    Column {
       Button(
           colors = ButtonDefaults.buttonColors(
               containerColor = Color(0xffffffff),
               contentColor = Color(0xffb8b8bb)
           ),
           onClick = {}
       ) {
           Text(
               text = "A button with poor contrast"
           )
       }
    }
}

@Composable
@Preview
fun ColorContrastPreview() {
    AccessibilityChecksTheme {
        ColorContrast()
    }
}
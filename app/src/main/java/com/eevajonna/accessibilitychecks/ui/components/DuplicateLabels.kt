package com.eevajonna.accessibilitychecks.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.eevajonna.accessibilitychecks.ui.theme.AccessibilityChecksTheme

@Composable
fun DuplicateLabels() {
    Column {
        Button({}) {
            Text("Learn more")
        }
        Button({}) {
            Text("Learn more")
        }
        Button({}) {
            Text("Learn more")
        }
    }
}

@Composable
@Preview
fun DuplicateLabelsPreview() {
    AccessibilityChecksTheme {
        DuplicateLabels()
    }
}
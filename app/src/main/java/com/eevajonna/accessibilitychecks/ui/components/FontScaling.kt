package com.eevajonna.accessibilitychecks.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eevajonna.accessibilitychecks.ui.theme.AccessibilityChecksTheme

@Composable
fun FontScaling() {
    Column {
        Text(
            modifier = Modifier.height(40.dp),
            fontSize = 60.sp,
            text = "Example text"
        )

    }
}

@Composable
@Preview
fun FontScalingPreview() {
    AccessibilityChecksTheme {
        FontScaling()
    }
}
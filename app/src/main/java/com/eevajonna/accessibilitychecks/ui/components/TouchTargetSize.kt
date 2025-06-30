package com.eevajonna.accessibilitychecks.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eevajonna.accessibilitychecks.ui.theme.AccessibilityChecksTheme

@Composable
fun TouchTargetSize() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(modifier = Modifier
            .background(MaterialTheme.colorScheme.primary)
            .size(20.dp)
            .clickable(
                onClickLabel = "Click"
            ) {}
        )
    }
}

@Composable
@Preview
fun TouchTargetSizePreview() {
    AccessibilityChecksTheme {
        TouchTargetSize()
    }
}
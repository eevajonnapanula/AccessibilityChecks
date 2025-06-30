package com.eevajonna.accessibilitychecks.ui.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eevajonna.accessibilitychecks.ui.components.ColorContrast
import com.eevajonna.accessibilitychecks.ui.components.DuplicateLabels
import com.eevajonna.accessibilitychecks.ui.components.FontScaling
import com.eevajonna.accessibilitychecks.ui.components.ItemLabelMissing
import com.eevajonna.accessibilitychecks.ui.components.ItemLabeledWithTypeOrState
import com.eevajonna.accessibilitychecks.ui.components.LinkPurposeUnclear
import com.eevajonna.accessibilitychecks.ui.components.TouchTargetSize
import com.eevajonna.accessibilitychecks.ui.theme.AccessibilityChecksTheme

@Composable
fun AccessibilityIssuesScreen() {
    Scaffold {
        Column(
            modifier = Modifier
                .padding(it)
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            SectionWithTitle("Duplicate labels") {
                DuplicateLabels()
            }
            SectionWithTitle("Item label missing") {
                ItemLabelMissing()
            }
            SectionWithTitle("Link purpose unclear") {
                LinkPurposeUnclear()
            }
            SectionWithTitle("Item labeled with type or state") {
                ItemLabeledWithTypeOrState()
            }
            SectionWithTitle("Text scaling") {
                FontScaling()
            }
            SectionWithTitle("Touch target size") {
                TouchTargetSize()
            }
            SectionWithTitle("Color Contrast") {
                ColorContrast()
            }
        }
    }
}

@Composable
fun SectionWithTitle(
    title: String,
    content: @Composable () -> Unit
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Title(title)
        content()
    }
}

@Composable
private fun Title(text: String) {
    Text(
        modifier = Modifier.semantics {
            heading()
        },
        text = text,
        style = MaterialTheme.typography.titleLarge
    )
}

@Composable
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
private fun AccessibilityIssuesScreenPreview() {
    AccessibilityChecksTheme {
        AccessibilityIssuesScreen()
    }
}

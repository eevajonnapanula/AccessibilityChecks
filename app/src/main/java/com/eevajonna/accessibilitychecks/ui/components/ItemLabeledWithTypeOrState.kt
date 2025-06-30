package com.eevajonna.accessibilitychecks.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.text
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import com.eevajonna.accessibilitychecks.ui.theme.AccessibilityChecksTheme

@Composable
fun ItemLabeledWithTypeOrState() {
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                modifier = Modifier.semantics {
                    contentDescription = "Checked"/*buildAnnotatedString {
                        append("Checked")
                    }*/
                },
                checked = true,
                onCheckedChange = {  },
            )
            Text(
                text = "Checkbox"
            )
        }
    }
}

@Composable
@Preview
fun ItemLabeledWithTypeOrStatePreview() {
    AccessibilityChecksTheme {
        ItemLabeledWithTypeOrState()
    }
}
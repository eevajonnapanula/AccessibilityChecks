package com.eevajonna.accessibilitychecks.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink
import androidx.compose.ui.tooling.preview.Preview
import com.eevajonna.accessibilitychecks.ui.theme.AccessibilityChecksTheme

@Composable
fun LinkPurposeUnclear() {
    Column {
        Text(
            text = buildAnnotatedString { 
                withLink(
                    link = LinkAnnotation.Url(
                        "https://developer.android.com/",
                        TextLinkStyles(style = SpanStyle(color = MaterialTheme.colorScheme.primary))
                    )
                ) {
                    append("Tap here")
                }
            }
        )
    }
}

@Composable
@Preview
fun LinkPurposeUnclearPreview() {
    AccessibilityChecksTheme {
        LinkPurposeUnclear()
    }
}
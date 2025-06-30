package com.eevajonna.accessibilitychecks

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.junit4.accessibility.enableAccessibilityChecks
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.tryPerformAccessibilityChecks
import com.eevajonna.accessibilitychecks.ui.components.ColorContrast
import com.eevajonna.accessibilitychecks.ui.components.DuplicateLabels
import com.eevajonna.accessibilitychecks.ui.components.FontScaling
import com.eevajonna.accessibilitychecks.ui.components.ItemLabelMissing
import com.eevajonna.accessibilitychecks.ui.components.ItemLabeledWithTypeOrState
import com.eevajonna.accessibilitychecks.ui.components.LinkPurposeUnclear
import com.eevajonna.accessibilitychecks.ui.components.TouchTargetSize
import com.eevajonna.accessibilitychecks.ui.theme.AccessibilityChecksTheme
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class AccessibilityIssuesTest {
    @Rule
    @JvmField
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Before
    fun setup() {
        composeTestRule.enableAccessibilityChecks()
    }

    // Should fail as all three buttons have identical text "Learn more"
    @Test
    fun duplicateLabels() {
        composeTestRule.setContent {
            AccessibilityChecksTheme {
                DuplicateLabels()
            }
        }
        composeTestRule.onRoot().tryPerformAccessibilityChecks()
    }

    // Should fail as the button doesn't have any label as the text is empty string
    @Test
    fun itemLabelMissing() {
        composeTestRule.setContent {
            AccessibilityChecksTheme {
                ItemLabelMissing()
            }
        }

        composeTestRule.onRoot().tryPerformAccessibilityChecks()
    }

    // Should fail because the link text is "Tap here" which is specified as
    // something that should be automatically picked up by automatic testing tools
    // (source: https://support.google.com/accessibility/android/answer/9663312?sjid=15789395296417019864-EU)
    @Test
    fun linkPurposeUnclear() {
        composeTestRule.setContent {
            AccessibilityChecksTheme {
                LinkPurposeUnclear()
            }
        }

        composeTestRule.onRoot().tryPerformAccessibilityChecks()
    }

    // Should fail because the checkbox contains text "checked",
    // which is something that should fail this check based on
    // https://support.google.com/accessibility/android/answer/6378990?sjid=15789395296417019864-EU&hl=en
    // The actual state is "On" as it's toggleable state.
    @Test
    fun itemLabeledWithTypeOrState() {
        composeTestRule.setContent {
            ItemLabeledWithTypeOrState()
        }

        composeTestRule.onRoot().tryPerformAccessibilityChecks()
    }

    // Should fail as the text doesn't fit the container.
    @Test
    fun textScaling() {
        composeTestRule.setContent {
            FontScaling()
        }

        composeTestRule.onRoot().tryPerformAccessibilityChecks()
    }

    // Should fail touch target size as the size of the element is 20.dp
    // However, if the text for the `Box`-element is removed, this test fails
    // with no speakable text present.
    @Test
    fun touchTargetSize() {
        composeTestRule.setContent {
            TouchTargetSize()
        }

        composeTestRule.onRoot().tryPerformAccessibilityChecks()
    }

    // Should fail, as the contrast between background of the button (#FFFFFF) and
    // text of the button (#B8B8BB) is 2:1.
    @Test
    fun colorContrast() {
        composeTestRule.setContent {
            ColorContrast()
        }

        composeTestRule.onRoot().tryPerformAccessibilityChecks()
    }
}
package com.gaurav.todoapp.component

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AdaptiveLayout(windowSizeClass: WindowWidthSizeClass) {
    when (windowSizeClass) {
        WindowWidthSizeClass.Compact -> SmallScreenLayout()
        WindowWidthSizeClass.Medium -> MediumScreenLayout()
        WindowWidthSizeClass.Expanded -> LargeScreenLayout()
    }
}


@Preview(showSystemUi = true)
@Composable
fun PreviewAdaptiveLayout() {
    AdaptiveLayout(WindowWidthSizeClass.Medium)
}

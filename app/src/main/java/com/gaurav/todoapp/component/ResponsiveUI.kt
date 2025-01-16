package com.gaurav.todoapp.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ResponsiveScreen() {
    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ) {
        val screenWidth = maxWidth
        val screenHeight = maxHeight

        if (screenWidth < 600.dp) {
            SmallScreenLayout()
        } else {
            LargeScreenLayout()
        }
    }
}

@Composable
fun SmallScreenLayout() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Small Screen Layout",
            style = MaterialTheme.typography.titleLarge)
    }
}

@Composable
fun MediumScreenLayout() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Medium Screen Layout",
            style = MaterialTheme.typography.headlineMedium)
    }
}

@Composable
fun LargeScreenLayout() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Large Screen Layout",
            style = MaterialTheme.typography.headlineLarge
        )
    }
}
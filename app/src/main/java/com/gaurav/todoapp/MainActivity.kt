package com.gaurav.todoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.gaurav.todoapp.component.AdaptiveLayout
import com.gaurav.todoapp.component.LoginScreen
import com.gaurav.todoapp.component.ResponsiveScreen
import com.gaurav.todoapp.ui.theme.ToDoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ToDoAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ResponsiveUI(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun ResponsiveUI(modifier: Modifier = Modifier) {
//    AdaptiveLayout(WindowWidthSizeClass.Expanded)
    LoginScreen()
}

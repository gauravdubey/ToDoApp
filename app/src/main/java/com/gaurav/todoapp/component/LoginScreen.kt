package com.gaurav.todoapp.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gaurav.todoapp.R
import com.gaurav.todoapp.data.model.User

@Composable
fun LoginScreen() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var isError by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Welcome to Login",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 32.dp)
        )

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            isError = isError
        )

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            isError = isError
        )

        Button(
            onClick = {
                isError = !isValidCredentials(email, password)
                if (!isError) {
                    // Perform login action here
                    println("Login successful")
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text("Login")
        }

        if (isError) {
            Text(
                text = "Invalid email or password",
                color = Color.Red,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}

fun isValidCredentials(email: String, password: String): Boolean {
    // This is a very basic validation. In a real app, you'd want more robust validation.
    return email.contains("@") && password.length >= 6
}

@Preview(showBackground = true)
@Composable
fun UserCardPreview() {
    UserCard(user = User("John Doe", "john.doe@example.com", R.drawable.ic_profile)) {}
}

@Composable
fun UserCard(user: Any, content: () -> Unit) {

}

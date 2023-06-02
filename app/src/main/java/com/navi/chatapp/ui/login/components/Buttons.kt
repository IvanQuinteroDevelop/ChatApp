package com.navi.chatapp.ui.login.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.navi.chatapp.ui.login.viewmodel.LoginViewModel
import com.navi.chatapp.ui.uidefault.theme.primaryBlue
import com.navi.chatapp.ui.uidefault.theme.skyBlue

@Composable
fun LoginButton(loginEnable: Boolean, loginViewModel: LoginViewModel) {
    Button(
        onClick = { loginViewModel.onLoginClick() },
        enabled = loginEnable,
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = primaryBlue,
            disabledContainerColor = skyBlue,
            contentColor = Color.White,
            disabledContentColor = Color.White
        )
    ) {
        Text(text = "Sign in")
    }
}
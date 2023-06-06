package com.navi.chatapp.ui.login.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.navi.chatapp.ui.login.viewmodel.LoginViewModel
import com.navi.chatapp.ui.uidefault.theme.*

@Composable
fun LoginButton(loginEnable: Boolean, loginViewModel: LoginViewModel) {
    Button(
        onClick = { loginViewModel.onLoginClick() },
        enabled = loginEnable, shape = RoundedCornerShape(dp8),
        modifier = Modifier.fillMaxWidth().padding(dp24).height(54.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = primaryBlue,
            disabledContainerColor = Color(0xFF78C8F9),
            contentColor = Color.White,
            disabledContentColor = Color.White
        )
    ) {
        Text(text = "Sign In", fontSize = 16.sp)
    }
}
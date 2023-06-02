package com.navi.chatapp.ui.login.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.navi.chatapp.R
import com.navi.chatapp.ui.login.components.EmailTextField
import com.navi.chatapp.ui.login.components.LoginButton
import com.navi.chatapp.ui.login.components.PasswordTextField
import com.navi.chatapp.ui.login.viewmodel.LoginViewModel
import com.navi.chatapp.ui.uidefault.theme.dp16
import com.navi.chatapp.ui.uidefault.theme.dp32
import com.navi.chatapp.ui.uidefault.theme.primaryBlue

@Composable
fun LoginScreen(loginViewModel: LoginViewModel, onNavigationHome: () -> Unit) {
    Box(
        Modifier
            .fillMaxSize()
            .padding(dp16)
    ) {
        Spacer(modifier = Modifier.height(dp32))
        Header(Modifier.align(Alignment.TopCenter))
        Body(Modifier.align(Alignment.Center), loginViewModel)
        Footer(Modifier.align(Alignment.BottomCenter))
    }
}


@Composable
fun Header(modifier: Modifier) {
    Image(
        painter = painterResource(id = R.drawable.ic_foreground_blue),
        contentDescription = "App icon",
        modifier = modifier
            .padding(vertical = dp32)
            .clip(CircleShape)
            .border(6.dp, primaryBlue, CircleShape)
    )
}

@Composable
fun Body(modifier: Modifier, loginViewModel: LoginViewModel) {

    val email: String by loginViewModel.email.observeAsState(initial = "")
    val password: String by loginViewModel.password.observeAsState(initial = "")
    val isLoginEnable: Boolean by loginViewModel.isLoginEnable.observeAsState(initial = false)

    Column(modifier = modifier) {
        Spacer(modifier = Modifier.size(16.dp))
        EmailTextField(email) {
            loginViewModel.onLoginChanged(it, password)
        }
        Spacer(modifier = Modifier.size(4.dp))
        PasswordTextField(password) {
            loginViewModel.onLoginChanged(email, it)
        }
        Spacer(modifier = Modifier.size(8.dp))
        LoginButton(isLoginEnable, loginViewModel)
        Spacer(modifier = Modifier.size(16.dp))
    }
}

@Composable
fun Footer(modifier: Modifier) {

}

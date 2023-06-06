package com.navi.chatapp.ui.login.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.navi.chatapp.R
import com.navi.chatapp.ui.login.components.CheckSignIn
import com.navi.chatapp.ui.login.components.EmailTextField
import com.navi.chatapp.ui.login.components.LoginButton
import com.navi.chatapp.ui.login.components.PasswordTextField
import com.navi.chatapp.ui.login.viewmodel.LoginViewModel
import com.navi.chatapp.ui.uidefault.theme.*

@Composable
fun LoginScreen(loginViewModel: LoginViewModel, onNavigationHome: () -> Unit) {
    Box(
        Modifier
            .fillMaxSize()
            .padding(dp24)
    ) {
        Spacer(modifier = Modifier.height(dp32))
        Header(Modifier.align(Alignment.TopCenter))
        Body(Modifier.align(Alignment.Center), loginViewModel)
        Footer(Modifier.align(Alignment.BottomCenter), loginViewModel)
    }
}


@Composable
fun Header(modifier: Modifier) {
    Column(modifier = modifier.padding(vertical = dp32)) {
        Image(
            painter = painterResource(id = R.drawable.ic_foreground_blue),
            contentDescription = "App icon",
            modifier = Modifier
                .clip(CircleShape)
                .border(6.dp, primaryBlue, CircleShape)
        )
        Spacer(modifier = Modifier.height(dp4))
        Text(
            text = stringResource(id = R.string.app_name),
            color = primaryBlue,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun Body(modifier: Modifier, loginViewModel: LoginViewModel) {

    val email: String by loginViewModel.email.observeAsState(initial = "")
    val password: String by loginViewModel.password.observeAsState(initial = "")

    Column(modifier = modifier.padding(vertical = dp32)) {
        Text(
            text = "Sign in to ChatApp",
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center,
            fontSize = 22.sp,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.size(dp16))
        EmailTextField(email) {
            loginViewModel.onLoginChanged(it, password)
        }
        Spacer(modifier = Modifier.size(dp16))
        PasswordTextField(password) {
            loginViewModel.onLoginChanged(email, it)
        }
        Spacer(modifier = Modifier.size(dp16))
        CheckSignIn()
    }
}

@Composable
fun Footer(modifier: Modifier, loginViewModel: LoginViewModel) {
    val isLoginEnable: Boolean by loginViewModel.isLoginEnable.observeAsState(initial = false)
    Box(modifier = modifier
        .fillMaxWidth()
        .padding(bottom = dp16)) {
        LoginButton(isLoginEnable, loginViewModel)
    }
}

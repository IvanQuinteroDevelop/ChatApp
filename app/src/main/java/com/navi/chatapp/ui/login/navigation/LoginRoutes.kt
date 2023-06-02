package com.navi.chatapp.ui.login.navigation

sealed class LoginRoutes( val route: String) {
    object Splash: LoginRoutes("splash_screen")
    object Login: LoginRoutes("login_screen")
}
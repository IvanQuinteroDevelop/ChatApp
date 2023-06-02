package com.navi.chatapp.ui.login.navigation

import android.app.Activity
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.navi.chatapp.ui.login.screen.LoginScreen
import com.navi.chatapp.ui.login.screen.SplashScreen
import com.navi.chatapp.ui.login.viewmodel.LoginViewModel
import com.navi.chatapp.ui.main.navigation.BottomNavigation

fun NavGraphBuilder.graphSplash(
    activity: Activity,
    navController: NavController,
    popUpTo: (String, String) -> Unit
) {
    val loginViewModel = LoginViewModel()
    composable(route = LoginRoutes.Splash.route) {
        SplashScreen(
            navController = navController,
            onNavigateLogin = {
                navController.navigate(LoginRoutes.Login.route) {
                    popUpTo(LoginRoutes.Splash.route) { inclusive = true }
                }
            }
        ) {
            popUpTo(LoginRoutes.Splash.route, BottomNavigation.route)
        }
    }

    composable(route = LoginRoutes.Login.route) {
        LoginScreen(
            loginViewModel = loginViewModel,
            onNavigationHome = {
                popUpTo(LoginRoutes.Login.route, BottomNavigation.route)
            }
        )
    }
}
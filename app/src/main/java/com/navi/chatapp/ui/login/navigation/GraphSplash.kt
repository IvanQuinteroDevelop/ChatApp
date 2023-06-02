package com.navi.chatapp.ui.login.navigation

import android.app.Activity
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

fun NavGraphBuilder.graphSplash(
    activity: Activity,
    navController: NavController,
    popUpTo: (String, String) -> Unit
) {
    composable(route = LoginRoutes.Splash.route) {

    }

    composable(route = LoginRoutes.Login.route) {

    }
}
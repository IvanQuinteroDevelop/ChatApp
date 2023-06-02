package com.navi.chatapp.ui.login.navigation

import android.app.Activity
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.navi.chatapp.ui.main.navigation.bottomGraph

@Composable
fun GraphStart(
    navController: NavHostController = rememberNavController(),
    activity: Activity,
    startDestination: String = LoginRoutes.Splash.route
) {
    NavHost(navController = navController, startDestination = startDestination) {
        graphSplash(
            activity = activity,
            navController = navController,
            popUpTo = { origin, destination ->
                navController.navigate(destination) { popUpTo(origin) {inclusive = true} }
            }
        )
        bottomGraph()
    }
}
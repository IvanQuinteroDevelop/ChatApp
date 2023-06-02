package com.navi.chatapp.ui.main.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.navi.chatapp.ui.main.screen.BottomNavigator


object BottomNavigation {
    const val route = "bottom_navigator"
}

fun NavGraphBuilder.bottomGraph() {
    composable(route = BottomNavigation.route) {
        BottomNavigator()
    }
}
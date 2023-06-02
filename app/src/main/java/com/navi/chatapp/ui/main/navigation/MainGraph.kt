package com.navi.chatapp.ui.main.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainGraph(
    navController: NavHostController = rememberNavController(),
    startDestination: String = MainRoutes.Chat.route
    ) {

    NavHost(navController = navController, startDestination = startDestination) {

        composable(route = MainRoutes.Chat.route) {

        }

        composable(route = MainRoutes.New.route) {

        }

        composable(route = MainRoutes.Profile.route) {

        }
    }
}
package com.navi.chatapp.ui.main.navigation

sealed class MainRoutes(val route: String) {
    object Chat: MainRoutes("chat_screen")
    object New: MainRoutes("new_screen")
    object Profile: MainRoutes("profile_screen")
}
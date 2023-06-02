package com.navi.chatapp.ui.main.screen

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.navi.chatapp.ui.main.navigation.MainGraph

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BottomNavigator() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { }
    ) {
        MainGraph(navController = navController)
    }
}
package com.navi.chatapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.navi.chatapp.ui.login.navigation.GraphStart
import com.navi.chatapp.ui.uidefault.theme.ChatAppTheme
import com.navi.chatapp.ui.uidefault.theme.whiteBackground

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = whiteBackground
                ) {
                    GraphStart(activity = this)
                }
            }
        }
    }
}
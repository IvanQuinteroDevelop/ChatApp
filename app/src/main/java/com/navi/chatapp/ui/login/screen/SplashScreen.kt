package com.navi.chatapp.ui.login.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.navi.chatapp.R
import com.navi.chatapp.ui.login.navigation.LoginRoutes
import com.navi.chatapp.ui.uidefault.theme.dp16
import com.navi.chatapp.ui.uidefault.theme.primaryBlue
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

@Composable
fun SplashScreen(
    navController: NavController,
    onNavigateLogin: () -> Unit,
    onNavigateHome: () -> Unit
) {

    LaunchedEffect(true) {
        delay(2500) // Esperar 2 segundos
        withContext(Dispatchers.Main) {
            navController.navigate(LoginRoutes.Login.route) // Cambiar a la pantalla de LoginScreen
        }
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = primaryBlue
    ) {
        Column(
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "splash image"
            )
            Spacer(modifier = Modifier.height(dp16))
            Text(
                text = stringResource(id = R.string.app_name),
                fontSize = 34.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White
            )
        }
    }
}
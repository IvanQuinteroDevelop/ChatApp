package com.navi.chatapp.ui.login.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CheckSignIn() {
    var myState by rememberSaveable { mutableStateOf(false) }

    Row {
        Checkbox(checked = myState, onCheckedChange = {myState = !myState})
        Spacer(modifier = Modifier.width(4.dp))
        Text(text = "Accept sing in with Touch/Face ID", Modifier.align(Alignment.CenterVertically))
    }
}
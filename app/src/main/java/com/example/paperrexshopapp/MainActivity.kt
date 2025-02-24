package com.example.paperrexshopapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp

import androidx.navigation.compose.rememberNavController
import com.example.paperrexshopapp.ui.navigation.NavGraph
import com.example.paperrexshopapp.ui.theme.PaperRexShopAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                MainApp()
        }
    }
}

@Composable
fun MainApp() {
    val navController = rememberNavController()

    PaperRexShopAppTheme {
        Scaffold(
            topBar = {
                DefaultHeader()
            },

            content =  {  paddingValues  ->
                Column(modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)) {
                    NavGraph(navController)
                }
            }
        )
    }
}

@Composable
fun DefaultHeader() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(96.dp)
        .background(Color(red = 248, green = 248, blue = 248))
        .padding(start = 16.dp, end = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Icon(imageVector = Icons.Filled.Menu, contentDescription = "", modifier = Modifier.size(32.dp))
            Icon(imageVector = Icons.Filled.Search, contentDescription = "", modifier = Modifier.size(32.dp))
        }

        Image(painterResource(R.drawable.prx), contentDescription = "")

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Icon(imageVector = Icons.Filled.AccountCircle, contentDescription = "", modifier = Modifier.size(32.dp))
            Icon(imageVector = Icons.Filled.ShoppingCart, contentDescription = "", modifier = Modifier.size(32.dp))
        }
    }
}


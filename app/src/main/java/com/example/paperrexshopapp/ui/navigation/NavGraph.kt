package com.example.paperrexshopapp.ui.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.paperrexshopapp.ui.screens.ProductDetail
import com.example.paperrexshopapp.ui.screens.ProductListScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "productList") {
        composable("productList") {
            ProductListScreen(navController = navController)
        }

        composable("productDetail/{productId}") { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId")?.toIntOrNull()
            if (productId != null) {
                ProductDetail(navController = navController, id = productId)
            } else {
                Text("Invalid product ID")
            }
        }
    }
}
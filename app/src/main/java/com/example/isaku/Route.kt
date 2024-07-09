package com.example.isaku

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun App() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Landing") {
        composable ("Landing") { Landing (navController = navController) }
        composable ("Register") { Register (navController = navController) }
        composable ("Login") { Login (navController = navController) }
        composable ("isiForm") { IsiForm (navController = navController)}
        composable ("Form") { Form (navController = navController) }
        composable ("FormSuccess") { FormSuccess (navController = navController) }
        composable ("Dashboard") { Dashboard (navController = navController) }
        composable ("QRCode") { QRCode (navController = navController) }
        composable ("Transfer") { Transfer (navController = navController) }
        composable ("Pin") { Pin (navController = navController) }
        composable ("TfSuccess") { TfSuccess (navController = navController) }
    }
}
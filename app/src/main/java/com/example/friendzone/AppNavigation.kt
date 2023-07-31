package com.example.friendzone

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.friendzone.screens.DataScreen
import com.example.friendzone.screens.EventoLista
import com.example.friendzone.screens.EventoDetalle
import com.example.friendzone.screens.HomeScreen
import com.example.friendzone.screens.perfilDos
import com.example.friendzone.screens.perfilUno


@Composable
fun AppNavigation() {
    val navController: NavHostController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreens.EventoDetalle.route
    ) {
        composable(AppScreens.perfilUno.route) {
            perfilUno(navController = navController)
        }
        composable(AppScreens.HomeScreen.route) {
            HomeScreen(navController = navController)
        }
        composable(AppScreens.perfilDos.route) {
            perfilDos(navController = navController)
        }
        composable(AppScreens.EventoLista.route) {
            EventoLista(navController = navController)
        }
        composable(AppScreens.EventoDetalle.route) {
            EventoDetalle(navController = navController)
        }
        composable(route = AppScreens.dataScreen.route) {
            DataScreen()
        }
    }
}


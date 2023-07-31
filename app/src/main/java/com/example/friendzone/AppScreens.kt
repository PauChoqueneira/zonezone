package com.example.friendzone

sealed class AppScreens (
    val route: String
) {
    object perfilUno: AppScreens("perfil_uno")
    object HomeScreen: AppScreens("home_screen")
    object perfilDos: AppScreens("perfil_dos")
    object dataScreen: AppScreens("data_screen")
    object EventoLista: AppScreens("evento_lista")
    object EventoDetalle: AppScreens("evento_detalle")

}
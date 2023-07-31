package com.example.friendzone.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberAsyncImagePainter

@Composable
fun DataScreen(
    dataViewModel: DataViewModel = viewModel()
){
    val getData = dataViewModel.state.value

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(painter = rememberAsyncImagePainter(model = getData.foto), contentDescription = null)
        Text(text = getData.nombres)
        Text(text = getData.ciudad)
        Text(text = getData.edad)
        Text(text = getData.descripcion)
        Text(text = "Pruebita")
        Text(text = getData.comunidades)

    }
}
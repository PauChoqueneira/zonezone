package com.example.friendzone.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.friendzone.R


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun perfilDos(navController: NavHostController? = null) {
    Scaffold(
        /*topBar = {
            Surface(
                color = Color(0xFF0072C9),
                contentColor = Color.White,
                modifier = Modifier.fillMaxWidth()
            ) {
                SmallTopAppBar(
                    title = { Text("Perfil de Usuario") }
                )
            }
        },*/
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ProfileImage()

                Spacer(modifier = Modifier.height(11.dp))

                ProfileInfoCard("JAS JAS", 310)
                Row(
                    modifier = Modifier
                        .padding(0.dp,11.dp,0.dp,5.dp)
                        .width(313.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    ProfileInfoCard(" Example City", 133)
                    ProfileInfoCard("25 años", 133)
                }
                Spacer(modifier = Modifier.height(11.dp))

                Button(
                    onClick = { /* Agregar descripción */ },
                    shape = RoundedCornerShape(15.dp),
                    modifier = Modifier
                        .padding(1.dp)
                        .width(310.dp)
                        .height(43.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFFF6AF1E))
                ) {
                    Text("Agregar descripción",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.itim)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFF000000),
                            textAlign = TextAlign.Center,
                        )
                    )
                }

                Spacer(modifier = Modifier.height(11.dp))

                ProfileInfoCard("Comunidades a las que pertenece:\n"+ " • ", 310)

                Spacer(modifier = Modifier.height(13.dp))
                Button(
                    onClick = { /* Cerrar sesión */ },
                    shape = RoundedCornerShape(15.dp),
                    modifier = Modifier
                        .padding(1.dp)
                        .width(165.dp)
                        .height(43.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFFD33A54))
                ) {
                    Text("Cerrar Sesión",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.itim)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFFFFFFFF),
                            textAlign = TextAlign.Center,
                        )
                    )
                }
            }
        }
    )
}

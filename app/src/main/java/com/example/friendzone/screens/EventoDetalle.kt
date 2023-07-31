package com.example.friendzone.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.friendzone.R


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EventoDetalle(navController: NavHostController? = null) {
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
                    .padding(20.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    "EVENTOS",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.itim)),
                        fontWeight = FontWeight(700),
                        color = Color(0xFF000000),
                    )
                )

                Spacer(modifier = Modifier.height(10.dp))

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                ) {
                   EventoDetInfoCard("Tarde de Lectura con Luis Montalvo desde Argentina.",310)
                   Spacer(modifier = Modifier.height(10.dp))
                   Row(
                       modifier = Modifier
                           .padding(0.dp,11.dp,0.dp,1.dp)
                           .width(312.dp),
                           horizontalArrangement = Arrangement.SpaceBetween,
                   ) {
                       EventoDetInfoCard("Ciudad",137)
                       EventoDetInfoCard("28, 2pm",137)

                   }
                    Spacer(modifier = Modifier.height(10.dp))
                    EventoDetInfoCard("Alameda San Jerónimo", 310)
                }
            }
        }
    )
}

@Composable
fun EventoDetInfoCard(value: String, value2: Int) {
    Surface(
        shape = RoundedCornerShape(15.dp),
        color = Color(0xFFFFFFFF),
        modifier = Modifier
            .padding(5.dp)
            .width(value2.dp)
            .height(58.dp)
            .border(
                width = 1.dp,
                color = Color(0xFFEDE6E6),
                shape = RoundedCornerShape(size = 15.dp)
            )
            .shadow(
                elevation = 4.dp,
                spotColor = Color(0x40000000),
                ambientColor = Color(0x40000000),
                shape = RoundedCornerShape(size = 12.dp)
            )
            .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 15.dp))
    ) {
        Column(
            modifier = Modifier.padding(1.dp)
        ) {

            Text(
                text = value,
                modifier = Modifier.padding(6.dp),
                style = TextStyle(
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.itim)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFF000000),
                )
            )
        }
    }
}


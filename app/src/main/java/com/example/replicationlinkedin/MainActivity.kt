package com.example.replicationlinkedin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.ArrowBack
import androidx.compose.material.icons.sharp.Search
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.replicationlinkedin.ui.theme.ReplicationLinkedInTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column (modifier = Modifier
                .background(Color.Gray)){
                Column (modifier = Modifier
                    .background(Color.White)){
                    searchBar()
                    profilePhotos()
                    userInfo()
                }
            }

        }
    }
}

@Composable
fun searchBar(){

        Row (modifier = Modifier.statusBarsPadding()){
            Icon(
                Icons.Sharp.ArrowBack,
                contentDescription = "Arrow back Icon",
                modifier = Modifier
                    .padding(7.dp)

            )
            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp))
            {
                Icon (
                    Icons.Sharp.Search,
                    contentDescription = "Search Icon",
                    modifier = Modifier
                        .padding(4.dp)
                )
            }
        }

}

@Composable
fun profilePhotos(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(1.dp)
    ){
        Image(painterResource(R.drawable.galaxia),
            contentDescription = "Imagen de portada",
            contentScale =  ContentScale.FillWidth,
            modifier = Modifier.height(125.dp)
                .padding(top = 2.dp))

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 60.dp, bottom = 15.dp),
            horizontalArrangement = Arrangement.Start) {
            Image(painterResource(R.drawable.perfil),
                contentDescription = "Imagen de perfil",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .size(140.dp)
                    .clip(CircleShape)
                    )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun userInfo(){
    Column(modifier = Modifier.fillMaxWidth()
        .padding(20.dp, 0.dp)) {
        Text(stringResource(R.string.user_name),
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .fillMaxWidth()
        )
        Text(stringResource(R.string.user_profession),
            fontSize = 16.sp,
            modifier = Modifier
                .padding(top = 7.dp))
        Text(stringResource(R.string.user_degree),
            fontSize = 14.sp,
            modifier = Modifier
                .padding(top = 30.dp))
        Text(stringResource(R.string.user_location),
            color = Color.Gray,
            fontWeight = FontWeight.Normal,
            fontSize = 13.sp)
        Text(stringResource(R.string.user_contacts),
            color = Color.Gray,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 15.dp))
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Card(
                shape = RoundedCornerShape(50), // Bordes redondeados
                modifier = Modifier
                    .padding(top = 4.dp)
                    .width(150.dp)
                    .clickable {}
            ) {
                Text(
                    text = "Se connecter",
                    color = Color.White, // Texto blanco
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Blue)
                        .padding(30.dp, 7.dp)
                )
            }
            Card(
                shape = RoundedCornerShape(50),
                modifier = Modifier
                    .padding(top = 4.dp)
                    .width(140.dp)
                    .border(1.dp, Color.Gray, CircleShape)

                    .clickable{}
            ) {
                Text(
                    text = "Message",
                    color = Color.Gray,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .padding(40.dp,7.dp)
                )
            }
            Card(
                shape = RoundedCornerShape(50),
                modifier = Modifier
                    .padding(top = 4.dp)
                    .width(30.dp)
                    .border(1.dp, Color.Gray, CircleShape)

                    .clickable{}
            ) {
                Text(
                    fontSize = 15.sp,
                    text = "...",
                    color = Color.Gray,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .padding(9.dp,7.dp)

                )
            }

        }
    }
}
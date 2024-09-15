package com.example.replicationlinkedin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.replicationlinkedin.ui.theme.ReplicationLinkedInTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                searchBar()
                profilePhotos()
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

@Preview(showBackground = true)
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
            .padding(20.dp, 50.dp),
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



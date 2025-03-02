package com.example.atividade3

import android.annotation.SuppressLint
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.Rgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.atividade3.ui.theme.Atividade3Theme
import java.net.URL

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Atividade3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    Screen(Modifier.fillMaxSize())
                }
            }
        }
    }
}

@Composable
fun Screen(modifier: Modifier) {
    Column {
    Row(modifier=Modifier.fillMaxWidth().padding(top = 40.dp).background(Color(40,120,130))) {
        Box(){
            Text(modifier = Modifier.padding(20.dp), text = "Categories")
        }
    }
    Column (modifier = Modifier.fillMaxSize()) {

        Row (modifier = Modifier.weight(1f)){
            Column (modifier = Modifier.fillMaxSize().weight(1f).background(Color(60,140,160)), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(imageVector = Icons.Default.Favorite, contentDescription = "Favorite", modifier = Modifier.size(120.dp))
                Text(modifier= Modifier, text = "Qualquer", color = Color.White, fontSize = 40.sp)
            }
            Column (modifier = Modifier.fillMaxSize().weight(1f).background(Color(50,130,150)), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(imageVector = Icons.Default.AccountBox, contentDescription = "Favorite", modifier = Modifier.size(120.dp))
                Text(modifier= Modifier, text = "Qualquer", color = Color.White, fontSize = 40.sp)
            }
        }
        Row (modifier = Modifier.weight(1f)){
            Column (modifier = Modifier.fillMaxSize().weight(1f).background(Color(25,115,125)), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Favorite", modifier = Modifier.size(120.dp))
                Text(modifier= Modifier, text = "Qualquer", color = Color.White, fontSize = 40.sp)
            }
            Column (modifier = Modifier.fillMaxSize().weight(1f).background(Color(20,110,120)), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(imageVector = Icons.Default.DateRange, contentDescription = "Favorite", modifier = Modifier.size(120.dp))
                Text(modifier= Modifier, text = "Qualquer", color = Color.White, fontSize = 40.sp)
            }
        }
        Row (modifier = Modifier.weight(1f)){
            Column (modifier = Modifier.fillMaxSize().weight(1f).background(Color(15,105,115)), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(imageVector = Icons.Default.Email, contentDescription = "Favorite", modifier = Modifier.size(120.dp))
                Text(modifier= Modifier, text = "Qualquer", color = Color.White, fontSize = 40.sp)
            }
            Column (modifier = Modifier.fillMaxSize().weight(1f).background(Color(10,100,110)), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(imageVector = Icons.Default.Build, contentDescription = "Favorite", modifier = Modifier.size(120.dp))
                Text(modifier= Modifier, text = "Qualquer", color = Color.White, fontSize = 40.sp)
            }
        }

        /*Column (modifier = Modifier.weight(1f)) {
            Row (modifier = Modifier.fillMaxSize().weight(1f).background(Color(60,140,160)), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
                Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(imageVector = Icons.Default.Favorite, contentDescription = "Favorite", modifier = Modifier.size(120.dp))
                    Text(modifier= Modifier, text = "Qualquer", color = Color.White, fontSize = 40.sp)
                }
            }
            Row (modifier = Modifier.fillMaxSize().weight(1f)) {
                Box(modifier=Modifier.fillMaxSize().weight(1f).background(Color(25,115,125))){}
            }
            Row (modifier = Modifier.fillMaxSize().weight(1f)) {
                Box(modifier=Modifier.fillMaxSize().weight(1f).background(Color(15,105,115))){}
            }

        }
        Column (modifier = Modifier.weight(1f)) {
            Row (modifier = Modifier.fillMaxSize().weight(1f)) {
                Box(modifier=Modifier.fillMaxSize().weight(1f).background(Color(50,130,150))){}
            }
            Row (modifier = Modifier.fillMaxSize().weight(1f)) {
                Box(modifier=Modifier.fillMaxSize().weight(1f).background(Color(20,110,120))){}
            }
            Row (modifier = Modifier.fillMaxSize().weight(1f)) {
                Box(modifier=Modifier.fillMaxSize().weight(1f).background(Color(10,100,110))){}
            }

        }*/
    }
    }
    }


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Atividade3Theme {
        Screen(Modifier.fillMaxSize().padding(top = 10.dp))
    }
}
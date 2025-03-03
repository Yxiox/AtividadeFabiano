package com.example.atividade5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.minimumInteractiveComponentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.atividade5.ui.theme.Atividade5Theme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Atividade5Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Screen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Screen( modifier: Modifier = Modifier) {
    Column(modifier = modifier){
        Row (modifier = Modifier.background(Color(red = 50, green = 100, blue = 255)).fillMaxSize().weight(1f).padding(start = 10.dp), horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
            Text("My Application", color = Color.White, fontSize = 25.sp, fontWeight = FontWeight.W600)
        }
        Column (modifier = Modifier.background(Color.White).fillMaxSize().weight(15f).padding(5.dp)) {
            Row (Modifier.padding(vertical = 10.dp)) {
                Text("Time", modifier = Modifier.padding(end = 50.dp), color = Color(red = 30, green = 30, blue = 30), fontWeight = FontWeight.Bold, fontSize = 20.sp)
                Text("1:07 AM", color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 20.sp)
            }
            Row (Modifier.padding(vertical = 10.dp)){
                Text("First Name", color = Color(red = 30, green = 30, blue = 30), fontWeight = FontWeight.Bold, fontSize = 20.sp)
                BasicTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 3.dp, end = 75.dp)
                        .background(Color.Transparent)
                        .drawBehind {
                            drawLine(
                                color = Color.Gray,
                                start = Offset(0f, size.height+10f),
                                end = Offset(size.width, size.height+10f),
                                strokeWidth = 2f
                            )
                        }
                )
            }
            Row (Modifier.padding(vertical = 10.dp)){
                Text("Last Name", color = Color(red = 30, green = 30, blue = 30), fontWeight = FontWeight.Bold, fontSize = 20.sp)
                BasicTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 3.dp, end = 75.dp)
                        .background(Color.Transparent)
                        .drawBehind {
                            drawLine(
                                color = Color.Gray,
                                start = Offset(0f, size.height+10f),
                                end = Offset(size.width, size.height+10f),
                                strokeWidth = 2f
                            )
                        }
                )
            }

            Row (Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Icon(Icons.Default.Star, contentDescription = "Estrela", tint = Color.LightGray, modifier = Modifier.size(50.dp))
                Icon(Icons.Default.Star, contentDescription = "Estrela", tint = Color.LightGray, modifier = Modifier.size(50.dp))
                Icon(Icons.Default.Star, contentDescription = "Estrela", tint = Color.LightGray, modifier = Modifier.size(50.dp))
                Icon(Icons.Default.Star, contentDescription = "Estrela", tint = Color.LightGray, modifier = Modifier.size(50.dp))
                Icon(Icons.Default.Star, contentDescription = "Estrela", tint = Color.LightGray, modifier = Modifier.size(50.dp))
            }
            Row (Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                TextButton(
                    content = { Text("Submit", color = Color.Black, fontSize = 25.sp, fontWeight = FontWeight.W500)},
                    onClick = {},
                    colors = ButtonDefaults.textButtonColors(
                        containerColor = Color.LightGray,
                        ),
                    shape = RectangleShape,
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 75.dp, vertical = 10.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Atividade5Theme {
        Screen()
    }
}
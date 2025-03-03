package com.example.atividade4

import android.annotation.SuppressLint
import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.atividade4.ui.theme.Atividade4Theme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Atividade4Theme {
                Scaffold(modifier = Modifier.fillMaxSize(), containerColor = Color.White) {
                    Screen(Modifier.fillMaxSize())
                }
            }
        }
    }
}

@Composable
fun Screen(modifier: Modifier) {
    Column (modifier = Modifier.padding(top = 40.dp, start = 20.dp, end = 20.dp)) {
        Column (modifier = Modifier.fillMaxSize().weight(5f), horizontalAlignment = Alignment.CenterHorizontally , verticalArrangement = Arrangement.Center) {
            Icon(Icons.Default.AccountCircle, contentDescription = "Logo?", modifier = Modifier.size(150.dp), tint = Color(red = 90, green = 190, blue = 90))
            Text("Chatt", fontSize = 35.sp, color = Color(red = 90, green = 190, blue = 90), fontWeight = FontWeight.Black)
            Text("Simple mobile chat and notes", color = Color(red = 90, green = 190, blue = 90), fontWeight = FontWeight.Black)
        }
        Row (modifier = Modifier.fillMaxSize().weight(1f)) {
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth().weight(1f).padding(end = 5.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(Color(red = 80, green = 110, blue = 195)),
            ) {
                Text("Sign in with ", color = Color.White)
                Icon(Icons.Default.Face, contentDescription = "Facebook", tint = Color.White)
            }

            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth().weight(1f).padding(end = 5.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(Color(red = 0, green = 170, blue = 255)),
            ) {
                Text("Sign in with ", color = Color.White)
                Icon(Icons.Default.Send, contentDescription = "Twitter", tint = Color.White)
            }

        }
        Row (modifier = Modifier.fillMaxSize().weight(0.5f), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Top) {
            Text("or")

        }
        Row (modifier = Modifier.fillMaxSize().weight(1f)) {

                OutlinedTextField(
                    value = "",
                    placeholder = { Text("E-mail", fontWeight = FontWeight.Bold)},
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedContainerColor = Color(red = 240, green = 240, blue = 240),
                        unfocusedBorderColor = Color.Transparent,
                        unfocusedPlaceholderColor = Color(red = 150, green = 150, blue = 150)
                    )
                )
        }
        Row (modifier = Modifier.fillMaxSize().weight(1f)) {
            OutlinedTextField(
                value = "",
                placeholder = { Text("Password", fontWeight = FontWeight.Bold)},
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Color(red = 240, green = 240, blue = 240),
                    unfocusedBorderColor = Color.Transparent,
                    unfocusedPlaceholderColor = Color(red = 150, green = 150, blue = 150)
                )
            )
        }
        Row (modifier = Modifier.fillMaxSize().weight(1f)) {
            Button(
                onClick = {},
                modifier = Modifier.fillMaxSize().padding(vertical = 10.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(Color(red = 90, green = 190, blue = 90)),
            ) {
                Text("Register", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 20.sp)
            }
        }
        Column (modifier = Modifier.fillMaxSize().weight(1.5f).padding(top = 25.dp), horizontalAlignment = Alignment.CenterHorizontally){
            Text("Log in", fontSize = 25.sp, fontWeight = FontWeight.Black, color = Color(red = 90, green = 190, blue = 90))
            Text("I've forgotten my password?")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Atividade4Theme {
        Screen(Modifier.fillMaxSize())
    }
}
package com.example.atividade1

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.DatePicker
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.atividade1.ui.theme.Atividade1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Atividade1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    Screen()
                }
            }
        }
    }
}

@Composable
fun Screen() {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 15.dp, vertical = 30.dp)) {
        Text(text = "UILabs", color = Color.White, fontSize = 18.sp)
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Title", color = Color.White, fontSize = 24.sp)
        OutlinedTextField(value = "", onValueChange ={}, modifier = Modifier
            .border(2.dp, Color.White)
            .fillMaxWidth())
        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Status", color = Color.White, fontSize = 24.sp)
        Row (verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = false, onClick = { /*TODO*/ })
            Text(text = "Done", color = Color.White, fontSize = 20.sp)
            RadioButton(selected = true, onClick = { /*TODO*/ })
            Text(text = "Not Done", color = Color.White, fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Priority", color = Color.White, fontSize = 24.sp)
        Row (verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = false, onClick = { /*TODO*/ })
            Text(text = "Low", color = Color.White, fontSize = 20.sp)
            RadioButton(selected = true, onClick = { /*TODO*/ })
            Text(text = "Medium", color = Color.White, fontSize = 20.sp)
            RadioButton(selected = false, onClick = { /*TODO*/ })
            Text(text = "High", color = Color.White, fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Time and Date", color = Color.White, fontSize = 24.sp)
        Text(text = "2025/02/27", color = Color.Gray)
        Row (horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()){
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Choose Date")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Choose Time")
            }
        }
        Row (modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Bottom){
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Cancel")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Reset")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Submit")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Atividade1Theme {
        Screen()
    }
}
package com.example.atividade2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.atividade2.ui.theme.Atividade2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Atividade2Theme {
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
    Row (modifier = Modifier.fillMaxSize()) {
        Column (modifier = Modifier.fillMaxSize().weight(1f)) {
            Box(modifier = Modifier.fillMaxSize().weight(1f).padding(5.dp).background(Color.DarkGray)) {  }
            Box(modifier = Modifier.fillMaxSize().weight(1f).padding(5.dp).background(Color.Magenta)) {  }

        }
        Column (modifier = Modifier.fillMaxSize().weight(1.5f)) {
            Box(modifier = Modifier.fillMaxSize().weight(1f).padding(5.dp).background(Color.Red)) {}
            Box(modifier = Modifier.fillMaxSize().weight(1f).padding(5.dp).background(Color.White)) {  }
            Box(modifier = Modifier.fillMaxSize().weight(1f).padding(5.dp).background(Color.Blue)) {  }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Atividade2Theme {
        Screen()
    }
}
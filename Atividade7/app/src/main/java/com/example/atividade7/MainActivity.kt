package com.example.atividade7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultShadowColor
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.example.atividade7.ui.theme.Atividade7Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Atividade7Theme {
                Scaffold(modifier = Modifier.fillMaxSize(), containerColor = Color(red = 30, green = 65, blue = 190)) { innerPadding ->
                    Screen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Screen(modifier: Modifier = Modifier) {
    Row (modifier = Modifier.background(Color.Black).fillMaxWidth().height(50.dp)) {  }
    Column (modifier = modifier){
        Row (modifier = Modifier.height(50.dp).background(Color.DarkGray).fillMaxSize(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
            Text(
                "BoaViagem",
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.wrapContentSize(),
                fontWeight = FontWeight.W800,
                fontSize = 30.sp
            )
        }
        Column (modifier = Modifier.padding(vertical = 100.dp)) {
            Row (modifier = Modifier.fillMaxSize().weight(1f), horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.CenterVertically) {
                Column (Modifier.fillMaxSize().weight(1f), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painter = painterResource(R.drawable.gastos), contentDescription = "Money", modifier = Modifier.size(120.dp));
                    Text("Novo Gasto", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Black)
                }
                Column (Modifier.fillMaxSize().weight(1f), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(R.drawable.maleta),
                        contentDescription = "Maleta",
                        modifier = Modifier.size(120.dp)
                    );
                    Text("Nova Viagem", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Black)

                }
            }
            Row (modifier = Modifier.background(Color(red = 30, green = 65, blue = 190)).fillMaxSize().weight(1f), horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.CenterVertically) {
                Column (Modifier.fillMaxSize().weight(1f), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(R.drawable.signpost),
                        contentDescription = "Money",
                        modifier = Modifier.size(120.dp)
                    );
                    Text(
                        "Minhas Viagens",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Black
                    )
                }

                Column (Modifier.fillMaxSize().weight(1f), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(R.drawable.globe),
                        contentDescription = "Money",
                        modifier = Modifier.size(120.dp)
                    );
                    Text(
                        "Configurações",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Black
                    )
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Atividade7Theme {
        Screen()
    }
}
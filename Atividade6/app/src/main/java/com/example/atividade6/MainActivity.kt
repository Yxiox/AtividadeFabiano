package com.example.atividade6

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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.sharp.Star
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.atividade6.ui.theme.Atividade6Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Atividade6Theme {
                Scaffold(modifier = Modifier.fillMaxSize(), containerColor = Color.White) { innerPadding ->
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
    Column(modifier = modifier){
        Row (Modifier.fillMaxWidth().size(50.dp).background(Color(red = 50, green = 170, blue = 255))) {  }
        Row (Modifier.padding(15.dp).fillMaxWidth().height(150.dp)) {
            Column (modifier = Modifier.fillMaxSize().weight(1.3f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                Image(
                    painter = painterResource(id = R.drawable.book_cover),
                    contentDescription = "Book Cover",

                )
            }
            Column (modifier = Modifier.fillMaxSize().weight(3f).padding(start = 15.dp)) {
                Row { Text("The Hobbit", fontSize = 25.sp) }
                Row { Text("JRR Tolkin", fontSize = 18.sp) }
                Row { Text("June 19, 2014", fontSize = 18.sp) }
                Row (modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.End, verticalAlignment = Alignment.Bottom) { TextButton(modifier = Modifier.width(120.dp),onClick = {}, content = { Text("Find", fontSize = 20.sp, fontWeight = FontWeight.W500, color = Color.White)}, colors = ButtonDefaults.textButtonColors(containerColor = Color(red = 50, green = 170, blue = 255)), shape = RectangleShape)  }
            }

        }
        Column (Modifier.padding(15.dp).fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Column (Modifier.padding(15.dp).fillMaxWidth()) {
                HorizontalDivider(thickness = 1.dp, color = Color.Gray)
            }
            Row (Modifier.height(100.dp) ,horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
                Column (horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(modifier = Modifier.size(70.dp).clip(CircleShape).background(Color(red = 50, green = 170, blue = 255))) {
                        Column (Modifier.fillMaxSize().padding(vertical = 20.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(text="4,0", textAlign = TextAlign.Center, modifier = Modifier.fillMaxSize().weight(2f), fontSize = 19.sp, color = Color.White)
                            Row (modifier = Modifier.fillMaxSize().weight(1f), horizontalArrangement = Arrangement.Center) {
                                Icon(Icons.Default.Star, contentDescription = "estrela", tint = Color.White)
                                Icon(Icons.Default.Star, contentDescription = "estrela", tint = Color.White)
                                Icon(Icons.Default.Star, contentDescription = "estrela", tint = Color.White)
                                Icon(Icons.Default.Star, contentDescription = "estrela", tint = Color.White)
                            }
                        }
                    }
                    Text("1#", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Column (horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(
                        modifier = Modifier.size(70.dp).clip(CircleShape)
                            .background(Color(red = 50, green = 170, blue = 255))
                    ) {
                        Column(
                            Modifier.fillMaxSize().padding(vertical = 15.dp),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                Icons.Default.Search,
                                contentDescription = "",
                                tint = Color.White,
                                modifier = Modifier.size(70.dp)
                            )
                        }
                    }
                    Text("Adventure", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Column (horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(
                        modifier = Modifier.size(70.dp).clip(CircleShape)
                            .background(Color(red = 50, green = 170, blue = 255))
                    ) {
                        Column(
                            Modifier.fillMaxSize().padding(vertical = 15.dp),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                Icons.Default.Share,
                                contentDescription = "",
                                tint = Color.White,
                                modifier = Modifier.size(70.dp)
                            )
                        }
                    }
                    Text("Similar", textAlign = TextAlign.Center)
                }
            }

            Column (Modifier.padding(15.dp).fillMaxWidth()) {
                HorizontalDivider(thickness = 1.dp, color = Color.Gray)
            }
        }
        Column (Modifier.padding(15.dp).fillMaxWidth()) {
            Text(modifier = Modifier.padding(horizontal = 25.dp), text = "Private investigator Cormonam Strike returns in a new mystery from Fobert Galbralith autor of this #1 International bookseller The Cuckboo's Calling", textAlign = TextAlign.Center)
        }
        Text(modifier = Modifier.padding(horizontal = 25.dp).fillMaxWidth(), text = "Read More", textAlign = TextAlign.Center, color =Color(red = 50, green = 170, blue = 255), fontWeight = FontWeight.W500 )
        Column (Modifier.padding(15.dp).fillMaxWidth()) {
            HorizontalDivider(thickness = 1.dp, color = Color.Gray)
        }
        Row (Modifier.padding(horizontal = 30.dp, vertical = 15.dp)) {
            Column (modifier = Modifier.padding(top=2.dp)) {
                Box(modifier = Modifier.size(35.dp).clip(CircleShape).background(Color(red = 50, green = 170, blue = 255)))
            }
            Column (modifier=Modifier.padding(horizontal = 8.dp)) {
                Text("Nickname", fontWeight = FontWeight.Black)
                Text("Comment comment comment comment comment comment comment comment comment comment comment comment comment .")
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Atividade6Theme {
        Screen()
    }
}
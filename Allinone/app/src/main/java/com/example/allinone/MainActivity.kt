package com.example.allinone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.allinone.ui.theme.AllInOneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AllInOneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Screen1()
                    //Screen2()
                    //Screen3(modifier = Modifier.fillMaxSize())
                    //Screen4(modifier = Modifier.fillMaxSize())
                    //Screen5(modifier = Modifier.fillMaxSize())

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


@Composable
fun Screen1() {
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
            RadioButton(selected = false, onClick = {  })
            Text(text = "Done", color = Color.White, fontSize = 20.sp)
            RadioButton(selected = true, onClick = {})
            Text(text = "Not Done", color = Color.White, fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Priority", color = Color.White, fontSize = 24.sp)
        Row (verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = false, onClick = {  })
            Text(text = "Low", color = Color.White, fontSize = 20.sp)
            RadioButton(selected = true, onClick = { })
            Text(text = "Medium", color = Color.White, fontSize = 20.sp)
            RadioButton(selected = false, onClick = {  })
            Text(text = "High", color = Color.White, fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Time and Date", color = Color.White, fontSize = 24.sp)
        Text(text = "2025/02/27", color = Color.Gray)
        Row (horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()){
            Button(onClick = {  }) {
                Text(text = "Choose Date")
            }
            Button(onClick = {  }) {
                Text(text = "Choose Time")
            }
        }
        Row (modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Bottom){
            Button(onClick = {  }) {
                Text(text = "Cancel")
            }
            Button(onClick = {  }) {
                Text(text = "Reset")
            }
            Button(onClick = {  }) {
                Text(text = "Submit")
            }
        }
    }
}

@Composable
fun Screen2() {
    Row (modifier = Modifier.fillMaxSize()) {
        Column (modifier = Modifier
            .fillMaxSize()
            .weight(1f)) {
            Box(modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .padding(5.dp)
                .background(Color.DarkGray)) {  }
            Box(modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .padding(5.dp)
                .background(Color.Magenta)) {  }

        }
        Column (modifier = Modifier
            .fillMaxSize()
            .weight(1.5f)) {
            Box(modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .padding(5.dp)
                .background(Color.Red)) {}
            Box(modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .padding(5.dp)
                .background(Color.White)) {  }
            Box(modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .padding(5.dp)
                .background(Color.Blue)) {  }

        }

    }
}

@Composable
fun Screen3(modifier: Modifier) {
    Column {
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(top = 40.dp)
            .background(Color(40, 120, 130))) {
            Box(){
                Text(modifier = Modifier.padding(20.dp), text = "Categories")
            }
        }
        Column (modifier = Modifier.fillMaxSize()) {

            Row (modifier = Modifier.weight(1f)){
                Column (modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(Color(60, 140, 160)), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(imageVector = Icons.Default.Favorite, contentDescription = "Favorite", modifier = Modifier.size(120.dp))
                    Text(modifier= Modifier, text = "Qualquer", color = Color.White, fontSize = 40.sp)
                }
                Column (modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(Color(50, 130, 150)), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(imageVector = Icons.Default.AccountBox, contentDescription = "Favorite", modifier = Modifier.size(120.dp))
                    Text(modifier= Modifier, text = "Qualquer", color = Color.White, fontSize = 40.sp)
                }
            }
            Row (modifier = Modifier.weight(1f)){
                Column (modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(Color(25, 115, 125)), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Favorite", modifier = Modifier.size(120.dp))
                    Text(modifier= Modifier, text = "Qualquer", color = Color.White, fontSize = 40.sp)
                }
                Column (modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(Color(20, 110, 120)), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(imageVector = Icons.Default.DateRange, contentDescription = "Favorite", modifier = Modifier.size(120.dp))
                    Text(modifier= Modifier, text = "Qualquer", color = Color.White, fontSize = 40.sp)
                }
            }
            Row (modifier = Modifier.weight(1f)){
                Column (modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(Color(15, 105, 115)), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(imageVector = Icons.Default.Email, contentDescription = "Favorite", modifier = Modifier.size(120.dp))
                    Text(modifier= Modifier, text = "Qualquer", color = Color.White, fontSize = 40.sp)
                }
                Column (modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(Color(10, 100, 110)), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(imageVector = Icons.Default.Build, contentDescription = "Favorite", modifier = Modifier.size(120.dp))
                    Text(modifier= Modifier, text = "Qualquer", color = Color.White, fontSize = 40.sp)
                }
            }

        }
    }
}
@Composable
fun Screen4(modifier: Modifier) {
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

@Composable
fun Screen5( modifier: Modifier = Modifier) {
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

@Composable
fun Screen6(modifier: Modifier = Modifier) {
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
    AllInOneTheme {
        Greeting("Android")
    }
}
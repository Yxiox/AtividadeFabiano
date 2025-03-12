package com.example.myregistry.screens

import android.graphics.drawable.Drawable
import android.graphics.drawable.PaintDrawable
import android.text.style.BackgroundColorSpan
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myregistry.ui.theme.MyRegistryTheme
import com.example.myregistry.R
import com.example.myregistry.components.MyPasswordField
import com.example.myregistry.components.MyTextField

@Composable
fun RegisterUserMainScreen(){
    Scaffold  {
        Column (modifier = Modifier
            .fillMaxSize()
            .padding(it), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            LogoLoad()
            RegisterUserFields()

        }

    }
}

@Composable
fun LogoLoad(){
    Column {
        Image(painter = painterResource(id = R.drawable.tf2logo), contentDescription = "logo",
            Modifier
                .clip(shape = CircleShape)
                .size(220.dp) )
    }
}

@Composable
fun RegisterUserFields(){
    val registerUserViewModel : RegisterUserViewModel = viewModel()
    var registerUser = registerUserViewModel.uiState.collectAsState()
    val ctx = LocalContext.current

    Column (verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(65.dp)) {
        MyTextField(value=registerUser.value.email, onValueChange = {registerUserViewModel.onEmailChange(it)}, "E-mail")
        MyTextField(value=registerUser.value.login, onValueChange = {registerUserViewModel.onLoginChange(it)}, "Login")
        MyPasswordField(value=registerUser.value.senha, onValueChange = {registerUserViewModel.onSenhaChange(it)}, "Senha")
        MyPasswordField(value=registerUser.value.confirmarsenha, confirmValue = registerUser.value.senha, onValueChange = {registerUserViewModel.onConfirmarSenhaChange(it)}, "Confirmar Senha")
       OutlinedButton(onClick = {
            if (!registerUser.value.senha.equals(registerUser.value.confirmarsenha)){
                Toast.makeText(ctx,"As senhas não conferem", Toast.LENGTH_LONG).show()
            }


        },
            Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp)
                .height(60.dp), shape = RoundedCornerShape(5.dp), colors = ButtonDefaults.outlinedButtonColors(containerColor = Color.White, contentColor = Color.DarkGray)) { Text(text = "Registrar") }

    }

}

@Composable
@Preview(showSystemUi = true, showBackground = true, device = "id:Galaxy Nexus")
    fun RegisterUserPreview(){
        MyRegistryTheme{
            RegisterUserMainScreen()
        }
    }


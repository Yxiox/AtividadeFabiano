package com.example.myregistry.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.twotone.Info
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDateRangePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.FocusState
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.focus.onFocusEvent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.myregistry.screens.RegisterUser
import com.example.myregistry.screens.RegisterUserViewModel



@Composable
fun MyPasswordField(value:String, onValueChange: (String) -> Unit, label:String){
    var isTouched = remember {
        mutableStateOf(false)
    }
    var focus = remember {
        FocusRequester()
    }
    var shown = remember {
        mutableStateOf(false)
    }
    Row (modifier = Modifier.fillMaxWidth().padding(5.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
        OutlinedTextField(value = value,
            onValueChange = {
                isTouched.value = true
                onValueChange(it)
            },
            Modifier.focusRequester(focus).onFocusEvent{if (it.hasFocus) {
                isTouched.value = true
            }}.weight(4f),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.White,
                focusedLabelColor = Color.White,
                cursorColor = Color.White,
                unfocusedBorderColor = Color.Gray,
                unfocusedLabelColor = Color.Gray),
            label = { Text(text = label) },
            supportingText = {if (isTouched.value && value.isBlank()){
                Text(text = "As senhas não conferem")
            } },
            trailingIcon = {
                val image = if (shown.value)
                    Icons.TwoTone.Info
                else Icons.Outlined.Info
                IconButton (onClick = { shown.value = !shown.value }) {
                    Icon(imageVector = image, contentDescription = if (shown.value) "Hide password" else "Show password")
                }
            },
            visualTransformation = if (shown.value) VisualTransformation.None else PasswordVisualTransformation(),
            isError = value.isBlank() && isTouched.value

        )
    }
}

@Composable
@Override
fun MyPasswordField(value:String, confirmValue:String, onValueChange: (String) -> Unit, label:String){
    var isTouched = remember {
        mutableStateOf(false)
    }
    var focus = remember {
        FocusRequester()
    }
    var shown = remember {
        mutableStateOf(false)
    }

    Row (modifier = Modifier.fillMaxWidth().padding(5.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
        OutlinedTextField(value = value,
            onValueChange = {
                isTouched.value = true
                onValueChange(it)
            },
            Modifier.focusRequester(focus).onFocusEvent{if (it.hasFocus) {
                isTouched.value = true
            }}.weight(4f),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.White,
                focusedLabelColor = Color.White,
                cursorColor = Color.White,
                unfocusedBorderColor = Color.Gray,
                unfocusedLabelColor = Color.Gray),
            label = { Text(text = label) },
            supportingText = {if (isTouched.value && !value.equals(confirmValue)){
                Text(text = "As senhas não conferem")
            } },
            trailingIcon = {
                val image = if (shown.value)
                    Icons.TwoTone.Info
                else Icons.Outlined.Info
                IconButton (onClick = { shown.value = !shown.value }) {
                    Icon(imageVector = image, contentDescription = if (shown.value) "Hide password" else "Show password")
                }
            },
            visualTransformation = if (shown.value) VisualTransformation.None else PasswordVisualTransformation(),
            isError = !value.equals(confirmValue) && isTouched.value

        )
    }
}

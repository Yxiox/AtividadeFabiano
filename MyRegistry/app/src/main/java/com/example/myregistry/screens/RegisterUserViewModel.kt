package com.example.myregistry.screens

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class RegisterUser(
    val login : String = "",
    val email : String = "",
    val senha : String = "",
    val confirmarsenha : String = ""
)

class RegisterUserViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(RegisterUser())
    val uiState : StateFlow<RegisterUser> = _uiState.asStateFlow()

    fun onEmailChange(email:String){
        _uiState.value = _uiState.value.copy(email = email)
    }

    fun onLoginChange(login: String){
        _uiState.value = _uiState.value.copy(login = login)

    }

    fun onSenhaChange(senha:String){
        _uiState.value = _uiState.value.copy(senha = senha)

    }

    fun onConfirmarSenhaChange(senha:String){
        _uiState.value = _uiState.value.copy(confirmarsenha = senha)

    }

}
package com.example.myregistry.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlin.math.log

data class RegisterUser(
    val login : String = "",
    val email : String = "",
    val senha : String = "",
    val confirmarsenha : String = "",
    val errorMessage : String = ""
) {
    fun validateAllFields() {
        if (login.isBlank()){
            throw Exception("Login é obrigatório")
        }
        if (email.isBlank()){
            throw Exception("E-mail é obrigatório")
        }
        if (senha.isBlank()){
            throw Exception("Senha é obrigatório")
        }
        if (confirmarsenha.isBlank()) {
            throw Exception("Confirme sua senha")
        }
        else if (!confirmarsenha.equals(senha)){
            throw Exception("As senhas não conferem")
        }

    }
}

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

    fun register():Boolean {
        try {
            _uiState.value.validateAllFields()
            return true
        }
        catch (e: Exception)
        {
            _uiState.value = _uiState.value.copy(errorMessage = e.message ?: "Unknown error")
            return false

        }


    }

    fun cleanErrorMessage() {
        _uiState.value = _uiState.value.copy(errorMessage = "")
    }

}
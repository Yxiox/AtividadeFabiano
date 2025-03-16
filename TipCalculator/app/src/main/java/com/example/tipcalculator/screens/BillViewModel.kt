package com.example.tipcalculator.screens

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class Bill(
    val billValue: Float = 0f,
    val tipPercentage: Float = 0f,
    val tip: Float = 0f,
    val finalValue: Float = 0f
)

class BillViewModel() : ViewModel() {
    private val _uiState = MutableStateFlow(Bill())
    val uiState : StateFlow<Bill> = _uiState.asStateFlow()

    fun onValueChange(billValue: Float){
        _uiState.value = _uiState.value.copy(
            billValue = billValue,
            tip=_uiState.value.billValue * _uiState.value.tipPercentage,
            finalValue=_uiState.value.billValue+_uiState.value.tip
        )
    }

    fun onTipPercentageChange(tipPercentage: Float){
        _uiState.value = _uiState.value.copy(
            tipPercentage = tipPercentage,
            tip=_uiState.value.billValue * (_uiState.value.tipPercentage/100),
            finalValue=_uiState.value.billValue+_uiState.value.tip
        )
    }


}

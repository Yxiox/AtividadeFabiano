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
) {
    fun getTip(newValue: Float, tipPercentage: Float) : Float {
        return newValue * (tipPercentage/100)
    }

    fun calculateFinalValue(newValue : Float, tipPercentage: Float): Float {
        return newValue + getTip(newValue, tipPercentage)
    }

}

class BillViewModel() : ViewModel() {
    private val _uiState = MutableStateFlow(Bill())
    val uiState : StateFlow<Bill> = _uiState.asStateFlow()

    fun onValueChange(billValue: Float, tipPercentage: Float){

        _uiState.value = _uiState.value.copy(
            billValue = billValue,
            tip= _uiState.value.getTip(billValue,tipPercentage),
            finalValue= _uiState.value.calculateFinalValue(billValue,tipPercentage)
        )
    }

    fun onTipPercentageChange(tipPercentage: Float, billValue: Float){
        _uiState.value = _uiState.value.copy(
            tipPercentage = tipPercentage,
            tip= _uiState.value.getTip(billValue, tipPercentage),
            finalValue=_uiState.value.calculateFinalValue(billValue, tipPercentage)
        )
    }


}

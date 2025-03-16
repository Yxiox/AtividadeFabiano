package com.example.tipcalculator.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlin.math.roundToInt

@Composable
fun TipCalculator()
{
    val billViewModel : BillViewModel = viewModel()
    val bill = billViewModel.uiState.collectAsState()
    Column (Modifier.padding(vertical = 40.dp, horizontal = 10.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally)  {
        Row (horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
            Column (modifier = Modifier.padding(10.dp)) {
                Text(text = "Valor")
            }
            Column (modifier = Modifier.padding(10.dp)) {
                TextField(
                    value = java.text.NumberFormat.getCurrencyInstance().apply {
                        maximumFractionDigits = 2
                        currency = java.util.Currency.getInstance("BRL")
                    }.format(bill.value.billValue),
                    onValueChange = { newValue:String ->
                        val cleanedValue = newValue.filter { it.isDigit() }
                        val parsedValue = cleanedValue.toFloat().div(100)
                        billViewModel.onValueChange(parsedValue)
                    },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    singleLine = true
                )
            }
        }

        Row (horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
            Column (modifier = Modifier.padding(10.dp)) {Text(text = "Tip %")}
            Column (modifier = Modifier.padding(10.dp)) {
                Slider(
                    value = bill.value.tipPercentage,
                    onValueChange = { newValue ->
                        val roundedValue = newValue.roundToInt()
                        billViewModel.onTipPercentageChange(tipPercentage = roundedValue.toFloat())
                    },
                    valueRange = 0f..30f,
                    steps = 60,
                    modifier = Modifier.onFocusChanged {
                        billViewModel.onTipPercentageChange(bill.value.tipPercentage)
                    }
                )
            }
        }

        Row (horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
            Column (modifier = Modifier.padding(10.dp).weight(0.6f)) {Text(text = "Tip")}
            Column (modifier = Modifier.padding(10.dp).weight(1f)) {
                Text(text = "15 %")
                TextField(value = java.text.NumberFormat.getCurrencyInstance().apply {
                    maximumFractionDigits = 2
                    currency = java.util.Currency.getInstance("BRL")
                }.format(bill.value.billValue*0.15), onValueChange = {})
            }
            Column (modifier = Modifier.padding(10.dp).weight(1f)) {
                Text(text = "${bill.value.tipPercentage.toInt()}%")
                TextField(value = java.text.NumberFormat.getCurrencyInstance().apply {
                    maximumFractionDigits = 2
                    currency = java.util.Currency.getInstance("BRL")
                }.format(bill.value.tip), onValueChange = {} )
            }
        }

        Row (horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
            Column (modifier = Modifier.padding(10.dp).weight(0.6f)) {Text(text = "Total")}
            Column (modifier = Modifier.padding(10.dp).weight(1f)) {
                TextField(value = java.text.NumberFormat.getCurrencyInstance().apply {
                    maximumFractionDigits = 2
                    currency = java.util.Currency.getInstance("BRL")
                }.format((bill.value.billValue*0.15)+bill.value.billValue), onValueChange = {})
            }
            Column (modifier = Modifier.padding(10.dp).weight(1f)) {
                TextField(value = java.text.NumberFormat.getCurrencyInstance().apply {
                    maximumFractionDigits = 2
                    currency = java.util.Currency.getInstance("BRL")
                }.format((bill.value.tip)+bill.value.billValue), onValueChange = {} )
            }
        }
    }
}

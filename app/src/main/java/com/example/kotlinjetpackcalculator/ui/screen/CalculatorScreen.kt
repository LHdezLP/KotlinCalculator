package com.example.kotlinjetpackcalculator.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun CalculatorScreen() {
    var num1 by remember { mutableStateOf("") }
    var num2 by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp)
    ) {

        TextField(
            value = num1,
            onValueChange = { num1 = it },
            label = { Text("1º Sumando") },
            modifier = Modifier.padding(8.dp),
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.NumberPassword)
        )

        TextField(
            value = num2,
            onValueChange = { num2 = it },
            label = { Text("2º Sumando") },
            modifier = Modifier.padding(8.dp),
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.NumberPassword)
        )

        Button(
            onClick = {
                result = try {
                    val number1 = num1.toDoubleOrNull()
                    val number2 = num2.toDoubleOrNull()
                    if (number1 != null && number2 != null) {
                        (number1 + number2).toString()
                    } else {
                        "Introduzca una suma válida"
                    }
                } catch (e: Exception) {
                    "Introduzca una suma válida"
                }
            },
            modifier = Modifier.padding(8.dp)
        ) {
            Text("CALCULAR")
        }

        TextField(
            value = result,
            onValueChange = {},
            readOnly = true,
            label = { Text("Resultado") },
            modifier = Modifier.padding(8.dp),
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
        )
    }
}

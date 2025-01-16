package com.example.kotlinjetpackcalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.kotlinjetpackcalculator.ui.screen.CalculatorScreen
import com.example.kotlinjetpackcalculator.ui.theme.KotlinJetpackCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            KotlinJetpackCalculatorTheme {
                CalculatorScreen()
            }
        }
    }
}



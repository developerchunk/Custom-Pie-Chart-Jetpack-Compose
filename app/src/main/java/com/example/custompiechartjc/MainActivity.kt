package com.example.custompiechartjc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.custompiechartjc.ui.theme.CustomPieChartJCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomPieChartJCTheme {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center
                ) {
                    // Preview with sample data
                    PieChart(
                        data = mapOf(
                            Pair("Sample-1", 150),
                            Pair("Sample-2", 120),
                            Pair("Sample-3", 110),
                            Pair("Sample-4", 170),
                            Pair("Sample-5", 120),
                        )
                    )

                }

            }
        }
    }
}

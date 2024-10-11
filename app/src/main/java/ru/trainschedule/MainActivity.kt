package ru.trainschedule

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import ru.trainschedule.presentation.TrainScheduleApp
import ru.trainschedule.presentation.ui.theme.TrainScheduleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TrainScheduleTheme {
                TrainScheduleApp()
            }
        }
    }
}
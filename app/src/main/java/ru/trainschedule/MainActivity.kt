package ru.trainschedule

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import ru.trainschedule.presentation.ui.SelectStationView
import ru.trainschedule.presentation.ui.selectStationStateStub
import ru.trainschedule.presentation.ui.theme.TrainScheduleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TrainScheduleTheme {
                SelectStationView(
                    state = remember { mutableStateOf(selectStationStateStub) },
                )
            }
        }
    }
}
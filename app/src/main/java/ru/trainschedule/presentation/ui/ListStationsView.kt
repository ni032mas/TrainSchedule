package ru.trainschedule.presentation.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Alarm
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.trainschedule.presentation.ui.theme.TrainScheduleTheme

data class Stop(val time: String, val station: String, val additionalInfo: String = "")

val stops = listOf(
    Stop("15:06", "Сочи", "+28° как +29°"),
    Stop("15:17", "Мацеста"),
    Stop("15:27", "Хоста"),
    Stop("15:33", "Известия"),
    Stop("15:39 - 15:43", "Адлер", "Стоянка 4 мин"),
    Stop("16:08", "Эсто-Садок"),
    Stop("16:13", "Роза Хутор", "+25° как +26°")
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TrainScheduleScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Поезд 6107") },
                navigationIcon = {
                    IconButton(onClick = {/* TODO: Implement back button action */ }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null)
                    }
                },
                actions = {
                    IconButton(onClick = { /* TODO: Implement alarm icon action */ }) {
                        Icon(Icons.Default.Alarm, contentDescription = null)
                    }
                }
            )
        }
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .padding(16.dp)
        ) {
            TrainDetails()
            Spacer(Modifier.height(16.dp))
            HorizontalDivider()
            Text(
                text = "Указано местное время",
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
            )
            StopList(stops)
        }
    }
}

@Composable
fun TrainDetails() {
    Column {
        Text(text = "Ласточка", color = MaterialTheme.colorScheme.primary, fontSize = 18.sp)
        Text(text = "Сочи — Роза Хутор", style = MaterialTheme.typography.titleMedium)
        Text(text = "Ежедневно", style = MaterialTheme.typography.bodyMedium)
        Text(text = "Везде", style = MaterialTheme.typography.bodyMedium)
    }
}

@Composable
fun StopList(stops: List<Stop>) {
    LazyColumn(
        contentPadding = PaddingValues(vertical = 4.dp)
    ) {
        itemsIndexed(stops) { index, item ->
            StopItem(stop = item)
            if (index < stops.lastIndex) {
                HorizontalDivider(
                    modifier = Modifier
                        .height(1.dp)
                        .padding(start = 24.dp)
                        .fillMaxWidth(),
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.2f)
                )
            }
        }
    }
}

@Composable
fun StopItem(stop: Stop) {
    Column(modifier = Modifier.padding(vertical = 8.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Filled.LocationOn,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(16.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = stop.time, style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.weight(0.5F)) {
                Text(text = stop.station, style = MaterialTheme.typography.bodyLarge)
//                Text(text = stop.station, style = MaterialTheme.typography.bodyLarge)
//                Text(text = stop.station, style = MaterialTheme.typography.bodyLarge)
                if (stop.additionalInfo.isNotEmpty()) {
                    Text(
                        text = stop.additionalInfo,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                    )
                }
            }
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
private fun TrainScheduleScreenPreview() {
    TrainScheduleTheme {
        TrainScheduleScreen()
    }
}
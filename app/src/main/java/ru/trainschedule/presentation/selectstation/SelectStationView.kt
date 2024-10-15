package ru.trainschedule.presentation.selectstation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Alarm
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import ru.trainschedule.R
import ru.trainschedule.domain.models.Segment
import ru.trainschedule.presentation.selectstation.model.SelectStationState
import ru.trainschedule.presentation.selectstation.model.SelectedDate
import ru.trainschedule.presentation.ui.formatDate
import ru.trainschedule.presentation.ui.selectStationStateStub
import ru.trainschedule.presentation.ui.theme.TrainScheduleTheme
import kotlin.time.Duration.Companion.seconds

@Composable
internal fun SelectStationScreen(
    onSegmentClick: (Segment) -> Unit,
    viewModel: SelectStationViewModel = viewModel(factory = SelectStationViewModel.Factory),
) {
    SelectStationView(
        state = viewModel.state.collectAsStateWithLifecycle(),
    )
}


@Composable
internal fun SelectStationView(state: State<SelectStationState>) {
    Scaffold(Modifier.fillMaxWidth()) { innerPadding ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            SearchBar()
            DateTabs(state)
            SegmentList(state)
        }
    }

}

@Composable
internal fun SearchBar() {
    Column {
        var textTo by remember { mutableStateOf(TextFieldValue("")) }
        var textFrom by remember { mutableStateOf(TextFieldValue("")) }
        OutlinedTextField(
            value = textFrom,
            onValueChange = { textFrom = it },
            label = { Text(stringResource(R.string.station_list_from)) },
            placeholder = { Text(stringResource(R.string.station_list_from)) },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(4.dp))
        OutlinedTextField(
            value = textTo,
            onValueChange = { textTo = it },
            label = { Text(stringResource(R.string.station_list_to)) },
            placeholder = { Text(stringResource(R.string.station_list_to)) },
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
internal fun DateTabs(state: State<SelectStationState>) {
    var selectedTabIndex by remember {
        mutableIntStateOf(
            value = when (state.value.selectedDate) {
                is SelectedDate.CustomDate -> 0
                is SelectedDate.Today -> 1
                is SelectedDate.Tomorrow -> 2
            }
        )
    }
    TabRow(
        selectedTabIndex = when (state.value.selectedDate) {
            is SelectedDate.CustomDate -> 0
            is SelectedDate.Today -> 1
            is SelectedDate.Tomorrow -> 2
        },
        modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
    ) {
        Tab(
            icon = { Icon(Icons.Default.Alarm, contentDescription = null) },
            selected = state.value.selectedDate is SelectedDate.CustomDate,
            onClick = { selectedTabIndex = 0 },
        )
        Tab(
            selected = state.value.selectedDate is SelectedDate.Today,
            onClick = { selectedTabIndex = 1 },
            text = { Text(stringResource(R.string.station_list_today_tab)) }
        )
        Tab(
            selected = state.value.selectedDate is SelectedDate.Tomorrow,
            onClick = { selectedTabIndex = 2 },
            text = { Text(stringResource(R.string.station_list_tomorrow_tab)) }
        )
    }
}

@Composable
internal fun SegmentList(state: State<SelectStationState>) {
    LazyColumn {
        item {
            Spacer(Modifier.height(8.dp))
            Text(
                text = state.value.selectedDate.date.formatDate(),
                style = MaterialTheme.typography.titleLarge,
            )
            Spacer(Modifier.height(8.dp))
            HorizontalDivider(
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = DividerAlpha),
                thickness = 1.dp
            )
        }
        items(state.value.segments) { item ->
            SegmentItem(item)
            HorizontalDivider(
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = DividerAlpha),
                thickness = 1.dp
            )
        }
    }
}

@Composable
internal fun SegmentItem(segment: Segment) {
    Column(Modifier.padding(vertical = 8.dp)) {
        Row {
            Text(segment.departure.formatDate(), style = MaterialTheme.typography.titleLarge)
            Spacer(Modifier.width(16.dp))
            Text(
                text = "(${segment.duration.toInt().seconds})",
                color = MaterialTheme.colorScheme.secondary
            )
            Spacer(Modifier.width(16.dp))
            Text(segment.arrival.formatDate(), style = MaterialTheme.typography.titleLarge)
            Spacer(Modifier.weight(1f))
        }
        segment.thread.transportSubtype.title?.let { Text(it) }
        Text(
            segment.thread.title,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = DividerAlpha)
        )
    }
}

@Preview(
    showBackground = true
)
@Composable
private fun SelectStationViewPreview() {
    TrainScheduleTheme {
        SelectStationView(
            state = remember {
                mutableStateOf(value = selectStationStateStub)
            }
        )
    }
}

private const val DividerAlpha = 0.5F
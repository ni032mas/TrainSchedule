package ru.trainschedule.presentation.ui.models

import ru.trainschedule.domain.models.Segment
import ru.trainschedule.domain.models.Station

internal data class SelectStationState(
    val isLoading: Boolean,
    val stationFrom: Station,
    val stationTo: Station,
    val selectedDate: SelectedDate,
    val stations: List<Station>,
    val segments: List<Segment>,
)

internal sealed class SelectedDate(val date: Long) {
    class Today(date: Long) : SelectedDate(date)
    class Tomorrow(date: Long) : SelectedDate(date)
    class CustomDate(date: Long) : SelectedDate(date)
}
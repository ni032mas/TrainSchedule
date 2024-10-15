package ru.trainschedule.presentation.selectstation.model

internal sealed interface SelectStationAction {
    data object Start : SelectStationAction
    data class SelectedDate(val date: Long) : SelectStationAction
    data class SelectedStationFrom(val station: String) : SelectStationAction
    data class SelectedStationTo(val station: String) : SelectStationAction
}

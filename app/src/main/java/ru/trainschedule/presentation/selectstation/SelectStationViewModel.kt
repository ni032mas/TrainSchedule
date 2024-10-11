package ru.trainschedule.presentation.selectstation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import ru.trainschedule.App
import ru.trainschedule.data.ScheduleRepository
import ru.trainschedule.presentation.selectstation.model.SelectStationAction
import ru.trainschedule.presentation.selectstation.model.SelectStationState
import ru.trainschedule.presentation.selectstation.model.SelectedDate

internal class SelectStationViewModel(
    private val scheduleRepository: ScheduleRepository = App.di.scheduleRepository,
) : ViewModel() {
    private val _state: MutableStateFlow<SelectStationState> = MutableStateFlow(
        SelectStationState(
            isLoading = true,
            selectedDate = SelectedDate.Today(System.currentTimeMillis()),
            stationFrom = null,
            stationTo = null,
            stations = emptyList(),
            segments = emptyList(),
        )
    )
    val state: StateFlow<SelectStationState> = _state

    fun acceptAction(action: SelectStationAction) {
        when (action) {
            SelectStationAction.Start -> start()
            is SelectStationAction.SelectedDate -> selectDate(action.date)
            is SelectStationAction.SelectedStationFrom -> selectStationFrom(action.station)
            is SelectStationAction.SelectedStationTo -> selectStationTo(action.station)
        }
    }

    private fun start() {
        viewModelScope.launch {
            _state.update {
                it.copy(isLoading = true)
            }
            scheduleRepository.getCountry()
            _state.update {
                it.copy(
                    isLoading = false,
                )
            }
        }
    }

    private fun selectDate(date: Long) {
        TODO()
    }

    private fun selectStationFrom(station: String) {
        viewModelScope.launch {
            _state.update {
                it.copy(
                    isLoading = true
                )
            }
            _state.update {
                it.copy(
                    isLoading = false,
                    stationFrom = scheduleRepository.getStation(station)
                )
            }
        }
    }

    private fun selectStationTo(station: String) {
        viewModelScope.launch {
            _state.update {
                it.copy(
                    isLoading = true
                )
            }
            _state.update {
                it.copy(
                    isLoading = false,
                    stationTo = scheduleRepository.getStation(station)
                )
            }
        }
    }
}
package ru.trainschedule.presentation.selectstation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
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
    private val scheduleRepository: ScheduleRepository,
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

    companion object {

        val Factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(
                modelClass: Class<T>,
                extras: CreationExtras,
            ): T {
                // Get the Application object from extras
                val application = checkNotNull(extras[APPLICATION_KEY])
                // Create a SavedStateHandle for this ViewModel from extras
                val savedStateHandle = extras.createSavedStateHandle()

                return SelectStationViewModel(
                    scheduleRepository = (application as App).di.scheduleRepository,
                ) as T
            }
        }
    }
}
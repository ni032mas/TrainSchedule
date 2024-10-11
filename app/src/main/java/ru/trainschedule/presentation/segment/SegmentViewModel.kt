package ru.trainschedule.presentation.segment

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import ru.trainschedule.domain.models.Segment
import ru.trainschedule.presentation.segment.model.SegmentAction
import ru.trainschedule.presentation.segment.model.SegmentState

internal class SegmentViewModel : ViewModel() {
    private val _state: MutableStateFlow<SegmentState> = MutableStateFlow(
        SegmentState(
            isLoading = true,
            segment = null,
        )
    )
    private var isStarted = false
    val state: StateFlow<SegmentState> = _state

    fun acceptAction(action: SegmentAction) {
        when (action) {
            is SegmentAction.Start -> start(action.segment)
            SegmentAction.AddedAlarm -> addedAlarm()
        }
    }

    private fun addedAlarm() {
        actor {}
        TODO("Not yet implemented")
    }

    private fun start(segment: Segment) {
        if (isStarted.not()) {
            _state.update {
                it.copy(
                    isLoading = false,
                    segment = segment,
                )
            }
            isStarted = true
        }

    }
}
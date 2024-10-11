package ru.trainschedule.presentation.segment.model

import ru.trainschedule.domain.models.Segment

internal sealed interface SegmentAction {
    data class Start(val segment: Segment) : SegmentAction
    data object AddedAlarm : SegmentAction
}
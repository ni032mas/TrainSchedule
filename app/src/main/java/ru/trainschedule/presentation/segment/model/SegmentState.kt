package ru.trainschedule.presentation.segment.model

import ru.trainschedule.domain.models.Segment

internal data class SegmentState(
    val isLoading: Boolean,
    val segment: Segment?,
)
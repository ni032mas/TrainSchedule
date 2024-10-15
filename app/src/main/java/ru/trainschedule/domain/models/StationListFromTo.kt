package ru.trainschedule.domain.models

internal data class StationListFromTo(
    val intervalSegments: List<IntervalSegment>,
    val pagination: Pagination,
    val search: Search,
    val segments: List<Segment>,
)

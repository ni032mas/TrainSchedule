package ru.trainschedule.domain.models

internal data class TicketsInfo(
    val etMarker: Boolean,
    val places: List<Place>,
)
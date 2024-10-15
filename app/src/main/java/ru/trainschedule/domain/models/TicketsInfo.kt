package ru.trainschedule.domain.models

import kotlinx.serialization.Serializable

@Serializable
internal data class TicketsInfo(
    val etMarker: Boolean,
    val places: List<Place>,
)
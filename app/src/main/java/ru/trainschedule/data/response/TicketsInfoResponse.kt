package ru.trainschedule.data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal class TicketsInfoResponse(
    @SerialName("et_marker")
    val etMarker: Boolean,
    @SerialName("places")
    val places: List<PlaceResponse>,
)
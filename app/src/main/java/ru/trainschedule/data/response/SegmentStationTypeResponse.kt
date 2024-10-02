package ru.trainschedule.data.response

import kotlinx.serialization.SerialName

internal enum class SegmentStationTypeResponse {
    @SerialName("station")
    STATION,

    @SerialName("settlement")
    SETTLEMENT,
}
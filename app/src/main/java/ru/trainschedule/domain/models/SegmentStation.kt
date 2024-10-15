package ru.trainschedule.domain.models

import kotlinx.serialization.Serializable

@Serializable
internal data class SegmentStation(
    val code: String,
    val popularTitle: String,
    val shortTitle: String,
    val stationType: StationType,
    val stationTypeName: String,
    val title: String,
    val transportType: TransportType,
    val type: SegmentStationType,
)
package ru.trainschedule.domain.models

internal class SegmentStation(
    val code: String,
    val popularTitle: String,
    val shortTitle: String,
    val stationType: StationType,
    val stationTypeName: String,
    val title: String,
    val transportType: TransportType,
    val type: SegmentStationType,
)
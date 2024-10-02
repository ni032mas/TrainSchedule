package ru.trainschedule.domain.models

class Station(
    val direction: String,
    val codes: StationCodes,
    val stationType: StationType,
    val title: String,
    val longitude: Float,
    val transportType: TransportType,
    val latitude: Float,
)
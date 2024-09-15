package ru.trainschedule.data.response

internal class StationResponse(
    val direction: String,
    val codes: CodesResponse,
    val stationType: StationTypeResponse,
    val title: String,
    val longitude: Float,
    val transportType: TransportTypeResponse,
    val latitude: Float,
)
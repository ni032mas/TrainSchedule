package ru.trainschedule.data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal class StationResponse(
    @SerialName("direction")
    val direction: String,
    @SerialName("codes")
    val codes: StationCodesResponse,
    @SerialName("station_type")
    val stationType: StationTypeResponse,
    @SerialName("title")
    val title: String,
    @SerialName("longitude")
    val longitude: Float,
    @SerialName("transport_type")
    val transportType: TransportTypeResponse,
    @SerialName("latitude")
    val latitude: Float,
)
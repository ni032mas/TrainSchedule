package ru.trainschedule.data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal class SegmentStationResponse(
    @SerialName("code")
    val code: String,
    @SerialName("popular_title")
    val popularTitle: String,
    @SerialName("short_title")
    val shortTitle: String,
    @SerialName("station_type")
    val stationType: StationTypeResponse,
    @SerialName("station_type_name")
    val stationTypeName: String,
    @SerialName("title")
    val title: String,
    @SerialName("transport_type")
    val transportType: TransportTypeResponse,
    @SerialName("type")
    val type: SegmentStationTypeResponse,
)
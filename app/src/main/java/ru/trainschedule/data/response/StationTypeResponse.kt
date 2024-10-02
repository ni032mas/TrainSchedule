package ru.trainschedule.data.response

import kotlinx.serialization.SerialName

internal enum class StationTypeResponse {
    @SerialName("station")
    STATION,

    @SerialName("platform")
    PLATFORM,

    @SerialName("stop")
    STOP,

    @SerialName("checkpoint")
    CHECKPOINT,

    @SerialName("post")
    POST,

    @SerialName("crossing")
    CROSSING,

    @SerialName("overtaking_point")
    OVERTAKING_POINT,

    @SerialName("train_station")
    TRAIN_STATION,

    @SerialName("airport")
    AIRPORT,

    @SerialName("bus_station")
    BUS_STATION,

    @SerialName("bus_stop")
    BUS_STOP,

    @SerialName("unknown")
    UNKNOWN,

    @SerialName("port")
    PORT,

    @SerialName("port_point")
    PORT_POINT,

    @SerialName("wharf")
    WHARF,

    @SerialName("river_port")
    RIVER_PORT,

    @SerialName("marine_station")
    MARINE_STATION,
}
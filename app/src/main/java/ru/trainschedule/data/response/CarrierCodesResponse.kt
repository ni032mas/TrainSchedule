package ru.trainschedule.data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal class CarrierCodesResponse(
    @SerialName("iata")
    val iata: String?,
    @SerialName("icao")
    val icao: String?,
    @SerialName("sirena")
    val sirena: String?,
)
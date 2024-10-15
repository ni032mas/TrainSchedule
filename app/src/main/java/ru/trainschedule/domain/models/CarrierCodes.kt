package ru.trainschedule.domain.models

import kotlinx.serialization.Serializable

@Serializable
internal data class CarrierCodes(
    val iata: String?,
    val icao: String?,
    val sirena: String?,
)
package ru.trainschedule.data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal class PriceResponse(
    @SerialName("cents")
    val cents: Int,
    @SerialName("whole")
    val whole: Int,
)
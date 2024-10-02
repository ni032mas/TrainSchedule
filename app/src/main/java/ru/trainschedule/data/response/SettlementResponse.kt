package ru.trainschedule.data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal class SettlementResponse(
    @SerialName("codes")
    val codes: SettlementCodesResponse,
    @SerialName("stations")
    val stations: List<StationResponse>,
    @SerialName("title")
    val title: String,
)
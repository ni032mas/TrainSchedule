package ru.trainschedule.data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal class RegionResponse(
    @SerialName("codes")
    val codes: RegionCodesResponse,
    @SerialName("settlements")
    val settlements: List<SettlementResponse>,
    @SerialName("title")
    val title: String,
)







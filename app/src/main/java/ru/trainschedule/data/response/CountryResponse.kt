package ru.trainschedule.data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal class CountryResponse(
    @SerialName("codes")
    val codes: CountryCodesResponse,
    @SerialName("regions")
    val regions: List<RegionResponse>,
    @SerialName("title")
    val title: String,
)
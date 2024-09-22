package ru.trainschedule.data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal class RegionCodesResponse(
    @SerialName("yandex_code")
    val yandexCode: String,
)
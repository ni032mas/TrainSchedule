package ru.trainschedule.data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal class StationCodesResponse(
    @SerialName("esr_code")
    val esrCode: String,
    @SerialName("yandex_code")
    val yandexCode: String,
)
package ru.trainschedule.data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal class CountryCodesResponse(
    @SerialName("yandex_code")
    val yandexCode: String,
)
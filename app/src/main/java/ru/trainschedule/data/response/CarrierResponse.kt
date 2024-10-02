package ru.trainschedule.data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal class CarrierResponse(
    @SerialName("address")
    val address: String,
    @SerialName("code")
    val code: Int,
    @SerialName("codes")
    val codes: CarrierCodesResponse,
    @SerialName("contacts")
    val contacts: String,
    @SerialName("email")
    val email: String,
    @SerialName("logo")
    val logo: String,
    @SerialName("logo_svg")
    val logoSvg: String?,
    @SerialName("phone")
    val phone: String,
    @SerialName("title")
    val title: String,
    @SerialName("url")
    val url: String,
)
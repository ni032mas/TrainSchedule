package ru.trainschedule.domain.models

internal class Carrier(
    val address: String,
    val code: Int,
    val codes: CarrierCodes,
    val contacts: String,
    val email: String,
    val logo: String,
    val logoSvg: String?,
    val phone: String,
    val title: String,
    val url: String,
)
package ru.trainschedule.domain.models

import kotlinx.serialization.Serializable

@Serializable
internal data class Price(
    val cents: Int,
    val whole: Int,
)
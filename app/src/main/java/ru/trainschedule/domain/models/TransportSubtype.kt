package ru.trainschedule.domain.models

import kotlinx.serialization.Serializable

@Serializable
internal data class TransportSubtype(
    val code: String?,
    val color: String?,
    val title: String?,
)
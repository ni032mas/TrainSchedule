package ru.trainschedule.domain.models

import kotlinx.serialization.Serializable

@Serializable
internal data class Place(
    val currency: String,
    val name: String,
    val price: Price,
)
package ru.trainschedule.domain.models

internal data class Place(
    val currency: String,
    val name: String,
    val price: Price,
)
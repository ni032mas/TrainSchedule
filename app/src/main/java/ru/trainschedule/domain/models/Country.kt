package ru.trainschedule.domain.models

internal data class Country(
    val codes: CountryCodes,
    val regions: List<Region>,
    val title: String,
)
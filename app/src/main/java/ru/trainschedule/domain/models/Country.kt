package ru.trainschedule.domain.models

class Country(
    val codes: CountryCodes,
    val regions: List<Region>,
    val title: String,
)
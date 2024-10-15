package ru.trainschedule.domain.models

internal data class SearchFromTo(
    val code: String,
    val popularTitle: String,
    val shortTitle: String,
    val title: String,
    val type: String,
)
package ru.trainschedule.domain.models

internal data class Search(
    val date: String,
    val from: SearchFromTo,
    val to: SearchFromTo,
)
package ru.trainschedule.domain.models

internal data class Pagination(
    val limit: Int,
    val offset: Int,
    val total: Int,
)
package ru.trainschedule.data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal class StationListFromToResponse(
    @SerialName("interval_segments")
    val intervalSegments: List<IntervalSegmentResponse>,
    @SerialName("pagination")
    val pagination: PaginationResponse,
    @SerialName("search")
    val search: SearchResponse,
    @SerialName("segments")
    val segments: List<SegmentResponse>,
)

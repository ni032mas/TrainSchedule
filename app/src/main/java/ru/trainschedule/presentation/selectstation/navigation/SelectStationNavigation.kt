package ru.trainschedule.presentation.selectstation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable
import ru.trainschedule.domain.models.Segment
import ru.trainschedule.presentation.selectstation.SelectStationScreen


@Serializable
internal object SelectStationRoute

internal fun NavController.navigateToSelectStationRoute(navOptions: NavOptions? = null) {
    navigate(route = SelectStationRoute, navOptions)
}

internal fun NavGraphBuilder.selectStationScreen(onSegmentClick: (Segment) -> Unit) {
    composable<SelectStationRoute> {
        SelectStationScreen(
            onSegmentClick = onSegmentClick
        )
    }
}

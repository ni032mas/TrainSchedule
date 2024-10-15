package ru.trainschedule.presentation.segment.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable
import ru.trainschedule.domain.models.Segment
import ru.trainschedule.presentation.segment.SegmentView


@Serializable
internal class SegmentRoute

internal fun NavController.navigateToSegmentRoute(
    segment: Segment,
    navOptions: NavOptions? = null,
) {
    navigate(route = segment, navOptions)
}

internal fun NavGraphBuilder.segmentScreen(
    onBackClick: () -> Unit,
) {
    composable<SegmentRoute> { backStackEntry ->
        SegmentView(
            segment = backStackEntry.savedStateHandle.toRoute<Segment>(),
            onBackClick = onBackClick,
        )
    }
}

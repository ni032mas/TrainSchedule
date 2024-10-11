package ru.trainschedule.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import ru.trainschedule.presentation.segment.navigation.navigateToSegmentRoute
import ru.trainschedule.presentation.segment.navigation.segmentScreen
import ru.trainschedule.presentation.selectstation.navigation.SelectStationRoute
import ru.trainschedule.presentation.selectstation.navigation.selectStationScreen

@Composable
fun TrainScheduleHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        navController = navController,
        startDestination = SelectStationRoute,
        modifier = modifier,
    ) {
        selectStationScreen { segment ->
            navController.navigateToSegmentRoute(segment)
        }
        segmentScreen(navController::popBackStack)
    }
}

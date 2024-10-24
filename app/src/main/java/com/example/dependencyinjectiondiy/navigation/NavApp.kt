package com.example.dependencyinjectiondiy.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dependencyinjectiondiy.ui.detailsscreen.DetailsScreen
import com.example.dependencyinjectiondiy.ui.homescreen.HomeScreen
import kotlinx.serialization.Serializable

sealed class NavRoutes{
    @Serializable
    data object HomeScreen
    @Serializable
    data object DetailsScreen
}

@Composable
fun NavApp() {
    val navController = rememberNavController()
    CompositionLocalProvider(
        LocalNavController provides navController
    ) {
        NavHost(navController = navController, startDestination = NavRoutes.HomeScreen) {
            composable<NavRoutes.HomeScreen> {
                HomeScreen()
            }
            composable<NavRoutes.DetailsScreen> {
                DetailsScreen()
            }
        }
    }
}
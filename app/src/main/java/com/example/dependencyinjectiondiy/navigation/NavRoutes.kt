package com.example.dependencyinjectiondiy.navigation

import kotlinx.serialization.Serializable

sealed class NavRoutes {
    @Serializable
    data object HomeScreen
    @Serializable
    data object DetailsScreen
}

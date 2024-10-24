package com.example.dependencyinjectiondiy.ui.homescreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.dependencyinjectiondiy.data.repository.ItemRepositoryImpl
import com.example.dependencyinjectiondiy.domain.entities.Item
import com.example.dependencyinjectiondiy.navigation.LocalNavController
import com.example.dependencyinjectiondiy.navigation.NavRoutes
import com.example.dependencyinjectiondiy.ui.theme.DependencyInjectionDiyTheme
import kotlinx.coroutines.flow.StateFlow


@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    val navController = LocalNavController.current
    val homeScreenViewModel = remember {
        HomeScreenViewModel(ItemRepositoryImpl())
    }
    val state by homeScreenViewModel.state.collectAsStateWithLifecycle()
//    val homeScreenViewModel = viewModel<HomeScreenViewModel>()
//    val homeScreenUiState by homeScreenViewModel.state.collectAsStateWithLifecycle()
    HomeContent(
        itemsList = state.items,
        loadItems = {homeScreenViewModel.laodItems()},
        navigateToDetailsScreen = {navController.navigate(NavRoutes.DetailsScreen)}
    )
}

@Composable
fun HomeContent(
    itemsList: List<Item>,
    loadItems: () -> Unit,
    navigateToDetailsScreen: () -> Unit
) {

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = navigateToDetailsScreen,
            ) {
                Text(text = "FAB")
            }
        }
    ) { innerPadding ->
        LazyColumn(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            item {
                Text(
                    text = "Hello YYYYYYYY!",
                )
            }
            itemsIndexed(itemsList) { index, item ->
                Text(text = "$index --- ${item.id} --- ${item.name}")
            }
            items(itemsList.size) { itemInList ->
                Row {
                    Text(text = "${itemsList[itemInList]}")
                    Text(text = "456")
                }
            }
            item {
                Button(onClick = loadItems) {
                    Text(text = "button")
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    DependencyInjectionDiyTheme {
        HomeScreen()
    }
}

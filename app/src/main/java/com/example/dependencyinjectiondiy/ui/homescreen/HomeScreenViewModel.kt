package com.example.dependencyinjectiondiy.ui.homescreen

import androidx.lifecycle.ViewModel
import com.example.dependencyinjectiondiy.data.repository.ItemRepositoryImpl
import com.example.dependencyinjectiondiy.domain.entities.Item
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeScreenViewModel(
    private val itemRepository: ItemRepositoryImpl
) : ViewModel() {
    data class HomeScreenState(
        val items: List<Item> = listOf(Item(id = 555, name = "init"))
    )

    private val _state = MutableStateFlow(HomeScreenState())
    val state = _state.asStateFlow()

    fun laodItems() {
        _state.value = _state.value.copy(items = itemRepository.getItems())
    }
}

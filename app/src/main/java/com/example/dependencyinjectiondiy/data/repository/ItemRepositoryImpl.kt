package com.example.dependencyinjectiondiy.data.repository

import com.example.dependencyinjectiondiy.domain.entities.Item
import com.example.dependencyinjectiondiy.domain.repository.ItemsRepository

class ItemRepositoryImpl : ItemsRepository {
    override fun getItems(): List<Item> {
        return listOf(Item(id = 1, name = "YYY"), Item(id = 2, name = "TTT"), Item(id = 3, name = "RRR"))
    }
}

package com.example.dependencyinjectiondiy.domain.repository

import com.example.dependencyinjectiondiy.domain.entities.Item

interface ItemsRepository {
    fun getItems(): List<Item>
}
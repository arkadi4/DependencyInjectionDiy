package com.example.dependencyinjectiondiy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dependencyinjectiondiy.navigation.NavApp
import com.example.dependencyinjectiondiy.ui.theme.DependencyInjectionDiyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DependencyInjectionDiyTheme {
                NavApp()

//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    NavApp(modifier = Modifier.padding(innerPadding))
//                }
            }
        }
    }
}

package com.example.dependencyinjectiondiy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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

package com.example.examplepagingwithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.examplepagingwithcompose.ui.theme.ExamplePagingWithComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExamplePagingWithComposeTheme {

                val vm: GamesVM = viewModel()
                val games = vm.games.value
                GamesScreen(games)
            }
        }
    }
}


package com.example.examplepagingwithcompose

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text

import androidx.compose.ui.Alignment
@Composable
fun GamesScreen(games: List<Game>) {
    Column {
        Text(
            text = "Games:",
            style = MaterialTheme.typography.h1,
            modifier = Modifier.padding(8.dp)
        )

        LazyColumn(
            contentPadding = PaddingValues(
                vertical = 8.dp,
                horizontal = 8.dp
            )
        ) {
            itemsIndexed(games) { index, game ->
                MatchItem(index, game)
            }
        }
    }
}

@Composable
fun MatchItem(index: Int, game: Game) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(2.dp),
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
        ) {
            Row(
                modifier = Modifier.padding(4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = game.homeTeam?.name ?: "",
                    style = MaterialTheme.typography.h2
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "vs", style = MaterialTheme.typography.h4)
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = game.visitorTeam?.name ?: "",
                    style = MaterialTheme.typography.h4
                )
            }
            Text(text = "Date: ${game.date?.substring(0,10)}")
            Text(
                text = "Index: $index",
                style = MaterialTheme.typography.body1,
                modifier = Modifier
                    .weight(0.2f)
                    .padding(8.dp)
            )
        }
    }

}
package com.example.gasoline.ui.feature

import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.gasoline.domain.FillUp
import com.example.gasoline.domain.fill1
import com.example.gasoline.domain.fill2
import com.example.gasoline.domain.fill3
import com.example.gasoline.ui.components.FillUpItem
import com.example.gasoline.ui.theme.GasolineTheme

@Composable
fun ListScree(){

}

@Composable
fun ListContent(
    recharges: List<FillUp>
){
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { }) {
                Icon(Icons.Default.Add, contentDescription = "add")
            }
        }
    ) {paddingValues ->
        LazyColumn(modifier = Modifier.consumeWindowInsets(paddingValues )) {
            items(recharges){ fillUp ->
                FillUpItem(
                    fill = fillUp,
                    onDeleteClick = { },
                    onItemClick = { }
                )
            }
        }
    }
}

@Preview
@Composable
private fun ListContentPreview(){
    GasolineTheme {
        ListContent(
            recharges = listOf(
               fill1,
                fill2,
                fill3
            )
        )
    }
}
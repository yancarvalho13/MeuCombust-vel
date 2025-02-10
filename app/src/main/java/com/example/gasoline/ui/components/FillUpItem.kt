package com.example.gasoline.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.LocalGasStation
import androidx.compose.material.icons.outlined.LocalGasStation
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.motionEventSpy

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gasoline.domain.FillUp
import com.example.gasoline.domain.fill1
import com.example.gasoline.domain.fill2

import com.example.gasoline.ui.theme.GasolineTheme

@Composable
fun FillUpItem(
    fill: FillUp,
    modifier: Modifier = Modifier,
    onDeleteClick: () -> Unit,
    onItemClick: () -> Unit
    ){
    Surface(
        onClick = onItemClick,
        modifier = modifier,
        shape = MaterialTheme.shapes.medium,
        shadowElevation = 2.dp,
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline)
    ) {
        Row (
            modifier = Modifier
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                imageVector = Icons.Filled.LocalGasStation,
                contentDescription = "GasStationIcon"
            )

            Spacer( modifier = Modifier.width(8.dp))

            Column (
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = fill.nameGasStation,
                    style = MaterialTheme.typography.titleLarge
                    )
                Spacer(modifier = Modifier.height(8.dp))
                Text(text =  "Price: %.2f".format(fill.price),
                    style = MaterialTheme.typography.bodyLarge)
                Text(text = "Liters: %.2f".format(fill.liters),
                    style = MaterialTheme.typography.bodyLarge)
                Text(text = "Total: %.2f".format(fill.liters * fill.price),
                    style = MaterialTheme.typography.bodyLarge)
            }

            Spacer( modifier = Modifier.width(8.dp))

            IconButton(onClick = {}
            ) {
                Icon(imageVector = Icons.Default.Delete, contentDescription = "delete")
            }
        }
    }
}

@Preview
@Composable
private fun FillUpItemPreview(){
    GasolineTheme {
        FillUpItem(
            fill = fill1,
            onDeleteClick = {},
            onItemClick = {}
        )
    }
}
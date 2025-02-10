package com.example.gasoline.ui.feature

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gasoline.ui.theme.GasolineTheme


@Composable
fun AddEditScreen(){

}

@Composable
fun AddEditContent(){
    var price by remember {mutableStateOf("")}
    var isError by remember {mutableStateOf(false)}
    Scaffold(

        floatingActionButton = {
            FloatingActionButton(onClick = { }) {
                Icon(Icons.Default.Check, contentDescription = "save")
            }
        }
    ) { Column(
        modifier = Modifier.consumeWindowInsets(it)
            .padding(16.dp)
    ) {
        OutlinedTextField(modifier = Modifier
            .fillMaxWidth(),
            value = "",
            onValueChange = {},
            placeholder = {
                Text(text = "Gas Station Name")
            })

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = price,
            onValueChange = { newValue ->

                if (newValue.matches(Regex("^[0-9]*\\.?[0-9]{0,2}$"))) {
                    price = newValue
                    isError = false
                } else {
                    isError = true
                }
            },
            label = { Text("Preço") },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Decimal
            ),
            isError = isError,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = price,
            onValueChange = { newValue ->

                if (newValue.matches(Regex("^[0-9]*\\.?[0-9]{0,2}$"))) {
                    price = newValue
                    isError = false
                } else {
                    isError = true
                }
            },
            label = { Text("Litros") },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Decimal
            ),
            isError = isError,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

    } }
}

@Preview
@Composable
private fun AddEditContentPreview(){
    GasolineTheme {
        AddEditContent(

        )
    }
}
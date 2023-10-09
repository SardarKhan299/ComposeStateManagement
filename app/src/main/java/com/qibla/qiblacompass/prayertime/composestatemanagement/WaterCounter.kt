package com.qibla.qiblacompass.prayertime.composestatemanagement

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StateFullCounter(modifier: Modifier) {

    var count by rememberSaveable { mutableStateOf(0) }

    StateLessCounter(count, onIncrement = {count++} ,modifier )

}

@Composable
private fun StateLessCounter(count: Int,onIncrement: ()->Unit, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(12.dp)) {
        if (count > 0) {
            Text(text = "You've had $count glasses.")
        }

        Button(
            onClick = { onIncrement.invoke() }, enabled = count < 10,
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text(text = "Add One")
        }
    }
}

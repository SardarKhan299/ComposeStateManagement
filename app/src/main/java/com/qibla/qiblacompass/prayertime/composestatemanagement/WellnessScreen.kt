package com.qibla.qiblacompass.prayertime.composestatemanagement

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier


@Composable
fun WellnessScreen(modifier: Modifier = Modifier){
    Column(modifier = modifier) {
        StateFullCounter(modifier)
        val list = remember {
            getWellnessTasks().toMutableStateList()
        }
        WellnessTaskRecyclerview(list = list, onClose = {task-> list.remove(task)})
    }

}
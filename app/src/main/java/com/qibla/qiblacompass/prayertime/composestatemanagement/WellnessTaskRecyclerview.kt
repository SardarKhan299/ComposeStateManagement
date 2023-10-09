package com.qibla.qiblacompass.prayertime.composestatemanagement

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.foundation.lazy.items

data class WellnessTask(val id: Int, val label: String)
fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }

@Composable
fun WellnessTaskRecyclerview(modifier: Modifier = Modifier,list:List<WellnessTask> = remember {getWellnessTasks()}) {
    LazyColumn(modifier = modifier){
        items(list){ task->
            WellnessTaskItem(taskName = task.label)
        }
    }

}
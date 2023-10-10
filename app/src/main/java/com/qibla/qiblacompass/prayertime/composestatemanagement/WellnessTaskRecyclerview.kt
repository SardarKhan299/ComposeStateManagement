package com.qibla.qiblacompass.prayertime.composestatemanagement

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf



@Composable
fun WellnessTaskRecyclerview(modifier: Modifier = Modifier,list:List<WellnessTask>,onCheckedTask: (WellnessTask, Boolean) -> Unit,
                             onClose:(WellnessTask)->Unit) {
    LazyColumn(modifier = modifier){
        items(list){ task->
            WellnessTaskItem(taskName = task.label,checked = task.checked,onCheckedChange = { checked -> onCheckedTask(task, checked) },
                onClose = { onClose(task) })
        }
    }

}
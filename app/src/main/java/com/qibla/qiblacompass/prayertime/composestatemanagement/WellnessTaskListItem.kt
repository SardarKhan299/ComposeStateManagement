package com.qibla.qiblacompass.prayertime.composestatemanagement


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp



@Composable
fun WellnessTaskItem(taskName: String,checked: Boolean,
                     onCheckedChange: (Boolean) -> Unit,onClose: () -> Unit,modifier:Modifier = Modifier){
    WellnessTaskListItem(modifier = modifier, taskName = taskName,
        checked =  checked ,
        oncheckChanged = onCheckedChange,
        onclose = onClose)
}

@Composable
fun WellnessTaskListItem(modifier: Modifier,taskName:String,checked:Boolean,oncheckChanged:(Boolean)->Unit,onclose:()->Unit) {
    
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {

        Text(text = taskName, modifier = Modifier
            .weight(1f)
            .padding(start = 16.dp))

        Checkbox(checked = checked, onCheckedChange = oncheckChanged)
        
        IconButton(onClick = onclose) {
            Icon(Icons.Filled.Close, contentDescription = "Close")
        }

    }
}
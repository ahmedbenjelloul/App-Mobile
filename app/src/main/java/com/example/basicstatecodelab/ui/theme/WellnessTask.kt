package com.example.basicstatecodelab.ui.theme

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue



data class WellnessTask(val id: Int, val label: String, var checked: MutableState<Boolean> = mutableStateOf(false))

package com.gijuno.edu_farm

data class LedItem(val time_num: String, val time_set: String, val light: String)
data class TemperItem(val time_num: String, val time_set: String, val temper: String)
data class WaterItem(val water_percent: String)
data class WaterCircleItem(val water_circle: String)
package com.seanproctor.composecharts.models

import androidx.compose.ui.geometry.Rect

data class BarPopupData(
    val bar: Bars.Data,
    val rect: Rect,
    val dataIndex: Int,
    val valueIndex: Int
)